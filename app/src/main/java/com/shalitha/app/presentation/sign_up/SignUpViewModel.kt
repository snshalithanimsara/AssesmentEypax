package com.shalitha.app.presentation.sign_up

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shalitha.app.domain.usecases.AuthUseCase
import com.shalitha.app.presentation.models.PUser
import com.shalitha.core.extensions.setLoading
import com.shalitha.core.extensions.setSuccess
import com.shalitha.network.state_models.Resource
import kotlinx.coroutines.launch


class SignUpViewModel(
    private val mAuthUseCase: AuthUseCase
) : ViewModel() {

    var signUpUserResponseLiveData = MutableLiveData<Resource<Boolean>>()

    /**
     *create new user on local db
     */
    fun createNewUser(pUser: PUser) = viewModelScope.launch {
        signUpUserResponseLiveData.setLoading()
        mAuthUseCase.createNewUser(pUser = pUser).also { result ->
            signUpUserResponseLiveData.setSuccess(data = result, message = null)
        }
    }
}
