package com.shalitha.app.presentation.sign_up

import android.os.Bundle
import android.util.Patterns
import com.shalitha.app.R
import com.shalitha.app.databinding.ActivitySignUpBinding
import com.shalitha.app.presentation.login.LoginActivity
import com.shalitha.app.presentation.models.PUser
import com.shalitha.core.base.BaseActivity
import com.shalitha.core.extensions.generateMd5Hash
import com.shalitha.core.extensions.getStringTrim
import com.shalitha.core.extensions.startActivity
import com.shalitha.core.extensions.validate
import com.shalitha.network.state_models.Resource
import com.shalitha.network.state_models.ResourceState
import org.koin.android.ext.android.inject

class SignUpActivity : BaseActivity() {


    private val mSignUpViewModel: SignUpViewModel by inject()
    private lateinit var mBinding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }


    private fun init() {
        bindUi()
        setUpObservers()
        attachClickListens()

    }

    private fun bindUi() {
        mBinding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }


    private fun attachClickListens() {
        mBinding.buttonSignUp.setOnClickListener {
            processSignUpUser()
        }
        mBinding.imageBack.setOnClickListener {
            finish()
        }
    }


    private fun setUpObservers() {
        mSignUpViewModel.signUpUserResponseLiveData.observe(this) { observerUserSignUpResponse(it) }
    }

    private fun observerUserSignUpResponse(signUpResponseState: Resource<Boolean>?) {
        when (signUpResponseState?.state) {
            ResourceState.LOADING -> {
                showProgressDialog()
            }

            ResourceState.SUCCESS -> {
                hideProgressDialog()
                signUpResponseState.data?.let { isSuccessful ->
                    if (isSuccessful) {
                        showAlertWithMessage(
                            alertMessage = getString(R.string.msg_signed_up_sucessful),
                            okAction = {
                                navigateToLogin()
                            })
                    } else {
                        showAlertWithMessage(
                            alertMessage = getString(R.string.msg_signed_up_failed)
                        )
                    }


                }
            }
        }
    }

    private fun navigateToLogin() {
        startActivity<LoginActivity> { }.also {
            finish()
        }
    }


    private fun processSignUpUser() {
        if (isFormValid())
            extractUserFromForm().also { pUser ->
                mSignUpViewModel.createNewUser(pUser = pUser)
            }
    }

    private fun extractUserFromForm() = PUser(
        firstName = mBinding.editFirstName.getStringTrim(),
        secondName = mBinding.editLastName.getStringTrim(),
        email = mBinding.editEmail.getStringTrim(),
        password = mBinding.editPassword.getStringTrim().generateMd5Hash()
    )

    private fun isFormValid(): Boolean {
        val isFirstNameAvailable: Boolean = mBinding.editFirstName.validate(
            message = getString(R.string.msg_first_name_required),
            validator = {
                it.isNotEmpty()
            })

        val isSecondNameAvailable: Boolean = mBinding.editLastName.validate(
            message = getString(R.string.msg_last_name_required),
            validator = {
                it.isNotEmpty()
            })
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

        val isConfirmPasswordAvailable: Boolean = mBinding.editConfirmPassword.validate(
            message = getString(R.string.msg_password_required),
            validator = {
                it.isNotEmpty()
            })

        var isPasswordMatches = false
        if (isPasswordAvailable && isConfirmPasswordAvailable)
            isPasswordMatches = mBinding.editConfirmPassword.validate(
                message = getString(R.string.msg_password_not_matching),
                validator = {
                    mBinding.editPassword.getStringTrim() == mBinding.editConfirmPassword.getStringTrim()
                })


        var isEmailValid = false
        if (isEmailAvailable)
            isEmailValid = mBinding.editEmail.validate(
                message = getString(R.string.msg_invalid_email),
                validator = {
                    Patterns.EMAIL_ADDRESS.matcher(it).matches()
                })

        return isFirstNameAvailable && isPasswordAvailable && isSecondNameAvailable && isEmailAvailable && isEmailValid && isPasswordMatches
    }


}