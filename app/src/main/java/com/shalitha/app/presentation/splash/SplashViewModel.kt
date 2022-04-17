package com.shalitha.app.presentation.splash

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shalitha.app.domain.usecases.AuthUseCase
import com.shalitha.app.presentation.models.PUser
import com.shalitha.core.extensions.setLoading
import com.shalitha.core.extensions.setSuccess
import com.shalitha.network.state_models.Resource
import kotlinx.coroutines.launch


class SplashViewModel(
    private val mAuthUseCase: AuthUseCase
) : ViewModel() {

    var isLoggedInUserAvailableLiveData = MutableLiveData<Resource<PUser>>()

    /**
     *check  logged in  user is available on local db
     */
    fun checkIsUserAvailable() =
        viewModelScope.launch {
            isLoggedInUserAvailableLiveData.setLoading()
            mAuthUseCase.getCurrentLoggedInUser()?.also { loggedInUser ->
                isLoggedInUserAvailableLiveData.setSuccess(data = loggedInUser, message = null)
            } ?: kotlin.run {
                isLoggedInUserAvailableLiveData.setSuccess(data = null, message = null)
            }
        }
}
