package com.shalitha.app.presentation.splash

import android.os.Bundle
import com.shalitha.app.databinding.ActivitySplashBinding
import com.shalitha.app.presentation.home.HomeActivity
import com.shalitha.app.presentation.login.LoginActivity
import com.shalitha.app.presentation.models.PUser
import com.shalitha.app.utills.executeThisWithDelay
import com.shalitha.core.base.BaseActivity
import com.shalitha.core.extensions.startActivity
import com.shalitha.network.state_models.Resource
import com.shalitha.network.state_models.ResourceState
import org.koin.android.ext.android.inject

class SplashActivity : BaseActivity() {

    private val mSplashViewModel: SplashViewModel by inject()
    private lateinit var mBinding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }


    private fun init() {
        setUpObservers()
        bindUi()
        checkForLoggedInUser()
    }


    private fun checkForLoggedInUser() {
        executeThisWithDelay(function = {
            mSplashViewModel.checkIsUserAvailable()
        })
    }

    private fun setUpObservers() {
        mSplashViewModel.isLoggedInUserAvailableLiveData.observe(this) {
            observerLoggedInUserResponse(
                it
            )
        }
    }


    private fun bindUi() {
        mBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    private fun observerLoggedInUserResponse(signedInResponseState: Resource<PUser>?) {
        when (signedInResponseState?.state) {
            ResourceState.LOADING -> {

            }

            ResourceState.SUCCESS -> {
                signedInResponseState.data?.let { signedInUser ->
                    navigateToHomePage()
                } ?: kotlin.run {
                    navigateToLoginPage()
                }
            }

        }
    }

    private fun navigateToLoginPage() {
        startActivity<LoginActivity> { }.also {
            finish()
        }
    }


    private fun navigateToHomePage() {
        startActivity<HomeActivity> { }.also {
            finish()
        }
    }


}