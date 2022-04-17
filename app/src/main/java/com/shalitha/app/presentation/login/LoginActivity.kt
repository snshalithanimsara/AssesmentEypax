package com.shalitha.app.presentation.login

import android.os.Bundle
import android.util.Patterns
import com.shalitha.app.R
import com.shalitha.app.databinding.ActivityLoginBinding
import com.shalitha.app.presentation.home.HomeActivity
import com.shalitha.app.presentation.models.PUser
import com.shalitha.app.presentation.sign_up.SignUpActivity
import com.shalitha.core.base.BaseActivity
import com.shalitha.core.extensions.generateMd5Hash
import com.shalitha.core.extensions.getStringTrim
import com.shalitha.core.extensions.startActivity
import com.shalitha.core.extensions.validate
import com.shalitha.network.state_models.Resource
import com.shalitha.network.state_models.ResourceState
import org.koin.android.ext.android.inject

class LoginActivity : BaseActivity() {

    private val mLoginViewModel: LoginViewModel by inject()
    private lateinit var mBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }


    private fun init() {
        setUpObservers()
        bindUi()
        attachClickListens()
    }

    private fun bindUi() {
        mBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }


    private fun attachClickListens() {
        mBinding.buttonSignIn.setOnClickListener {
            processLoginUser()
        }

        mBinding.buttonSignUp.setOnClickListener {
            navigateToSignUpPage()
        }
    }

    private fun navigateToSignUpPage() {
        startActivity<SignUpActivity> { }
    }


    private fun processLoginUser() {
        if (isFormValid())
            mLoginViewModel.checkIsUserAvailableWithThisEmail(
                email = mBinding.editEmail.getStringTrim(),
                passwordString = mBinding.editPassword.getStringTrim().generateMd5Hash()
            )
    }

    private fun setUpObservers() {
        mLoginViewModel.userSignedInResponseLiveData.observe(this) { observerUserSignInResponse(it) }
    }


    private fun isFormValid(): Boolean {
        val isEmailAvailable: Boolean = mBinding.editEmail.validate(
            message = getString(R.string.msg_email_required),
            validator = {
                it.isNotEmpty()
            })

        val isPasswordAvailable: Boolean = mBinding.editPassword.validate(
            message = getString(R.string.msg_password_required),
            validator = {
                it.isNotEmpty()
            })

        var isEmailValid = false
        if (isEmailAvailable)
            isEmailValid = mBinding.editEmail.validate(
                message = getString(R.string.msg_invalid_email),
                validator = {
                    Patterns.EMAIL_ADDRESS.matcher(it).matches()
                })

        return isPasswordAvailable && isEmailAvailable && isEmailValid
    }


    private fun observerUserSignInResponse(signInResponseState: Resource<PUser>?) {
        when (signInResponseState?.state) {
            ResourceState.LOADING -> {
                showProgressDialog()
            }

            ResourceState.SUCCESS -> {
                hideProgressDialog()
                signInResponseState.data?.let { signedInUser ->
                    showAlertWithMessage(
                        alertMessage = getString(R.string.msg_login_successful),
                        okAction = {
                            navigateToHome()
                        })
                } ?: kotlin.run {
                    showAlertWithMessage(alertMessage = getString(R.string.msg_password_incorrect))
                }
            }

            ResourceState.ERROR -> {
                showAlertWithMessage(alertMessage = getString(R.string.msg_user_not_found))
            }
        }
    }

    private fun navigateToHome() {
        startActivity<HomeActivity> { }.also {
            finish()
        }
    }


}