package com.shalitha.app.domain.usecases


import com.shalitha.app.domain.repository.NewsRepository
import com.shalitha.app.presentation.models.PFetchNewsResponse


class NewsUseCase(private val mNewsRepository: NewsRepository) {
    suspend fun fetchNewsWithSearchQuery(searchQuery: String?): PFetchNewsResponse? =
        mNewsRepository.fetchNewsWithSearchQuery(searchQuery = searchQuery)

    suspend fun fetchBreakingNewsList(countryCode: String): PFetchNewsResponse? =
        mNewsRepository.fetchBreakingNewsList(countryCode = countryCode)

}