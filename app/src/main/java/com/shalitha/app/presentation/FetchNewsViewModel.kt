package com.shalitha.app.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shalitha.app.domain.usecases.NewsUseCase
import com.shalitha.app.presentation.models.PArticlesItem
import com.shalitha.core.extensions.setError
import com.shalitha.core.extensions.setLoading
import com.shalitha.core.extensions.setSuccess
import com.shalitha.network.retrofit.ErrorHandler
import com.shalitha.network.state_models.Resource
import kotlinx.coroutines.launch


class FetchNewsViewModel(
    private val mNewsUseCase: NewsUseCase
) : ViewModel() {

    var fetchNewsListResponseLiveData = MutableLiveData<Resource<List<PArticlesItem>?>>()
    var fetchBreakingNewsListResponseLiveData = MutableLiveData<Resource<List<PArticlesItem>?>>()


    fun makeGetNewsListRequest(searchQuery: String?) = viewModelScope.launch {
        try {
            fetchNewsListResponseLiveData.setLoading()

            mNewsUseCase.fetchNewsWithSearchQuery(searchQuery = searchQuery)
                .also { pFetchNewsResponse ->
                    fetchNewsListResponseLiveData.setSuccess(
                        data = pFetchNewsResponse?.articles?.filterNotNull(),
                        message = null
                    )
                }

        } catch (e: Exception) {
            fetchNewsListResponseLiveData.setError(
                response = ErrorHandler.getApiErrorMessage(
                    error = e
                )
            )
            return@launch
        }
    }

    fun makeGetBreakingNewsListRequest() = viewModelScope.launch {
        try {
            fetchBreakingNewsListResponseLiveData.setLoading()

            mNewsUseCase.fetchBreakingNewsList(countryCode = "us")
                .also { pFetchNewsResponse ->

                    fetchBreakingNewsListResponseLiveData.setSuccess(
                        data = pFetchNewsResponse?.articles?.filterNotNull(),
                        message = null
                    )
                }

        } catch (e: Exception) {
            fetchBreakingNewsListResponseLiveData.setError(
                response = ErrorHandler.getApiErrorMessage(
                    error = e
                )
            )
            return@launch
        }
    }
}
