package com.shalitha.app.presentation.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shalitha.app.domain.usecases.AuthUseCase
import com.shalitha.app.presentation.models.PUser
import com.shalitha.core.extensions.setError
import com.shalitha.core.extensions.setLoading
import com.shalitha.core.extensions.setSuccess
import com.shalitha.network.state_models.Resource
import kotlinx.coroutines.launch


class LoginViewModel(
    private val mAuthUseCase: AuthUseCase
) : ViewModel() {

    var userSignedInResponseLiveData = MutableLiveData<Resource<PUser>>()

    /**
     *check if the user is on local db
     */
    fun checkIsUserAvailableWithThisEmail(email: String, passwordString: String) =
        viewModelScope.launch {
            userSignedInResponseLiveData.setLoading()
            mAuthUseCase.findUserWithThisEmail(email = email)?.also { userWithTheEmail ->
                if ((userWithTheEmail.password == passwordString)) {
                    setThisUserAsSignedInUser(signedInUser = userWithTheEmail).also { result ->
                        userSignedInResponseLiveData.setSuccess(
                            data = userWithTheEmail,
                            message = null
                        )
                    }
                } else
                    userSignedInResponseLiveData.setSuccess(data = null, message = null)
            } ?: kotlin.run {
                userSignedInResponseLiveData.setError(response = null)
            }
        }

    private suspend fun setThisUserAsSignedInUser(signedInUser: PUser): Boolean {
        return mAuthUseCase.setThisAsCurrentLoggedInUser(email = signedInUser.email)
    }
}
