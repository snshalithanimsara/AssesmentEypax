package com.shalitha.app.di

import com.shalitha.app.data.datasource.AuthLocalDataSource
import com.shalitha.app.data.datasource.NewsRemoteDataSource
import com.shalitha.app.data.repository.AuthRepositoryImpl
import com.shalitha.app.data.repository.NewsRepositoryImpl
import com.shalitha.app.datasource.local.AuthLocalDataSourceImpl
import com.shalitha.app.datasource.remote.NewsRemoteDataSourceImpl
import com.shalitha.app.domain.repository.AuthRepository
import com.shalitha.app.domain.repository.NewsRepository
import com.shalitha.app.domain.usecases.AuthUseCase
import com.shalitha.app.domain.usecases.NewsUseCase
import com.shalitha.app.presentation.FetchNewsViewModel
import com.shalitha.app.presentation.login.LoginViewModel
import com.shalitha.app.presentation.sign_up.SignUpViewModel
import com.shalitha.app.presentation.splash.SplashViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * This is the koin module  used for the App CLEAN Architecture
 */

val mUseCaseModule = module {
    factory {
        AuthUseCase(mAuthRepository = get())
    }

    factory {
        NewsUseCase(mNewsRepository = get())
    }
}


val mRepositoryModule = module {

    single<AuthRepository> {
        AuthRepositoryImpl(mAuthLocalDataSource = get())
    }

    single<NewsRepository> {
        NewsRepositoryImpl(mNewsRemoteDataSource = get())
    }
}


val mDataSourceModule = module {
    single<AuthLocalDataSource> {
        AuthLocalDataSourceImpl(
            mUserDao = get()
        )
    }

    single<NewsRemoteDataSource> {
        NewsRemoteDataSourceImpl(
            mNewsApi = get()
        )
    }
}

val viewModelModule: Module = module {
    viewModel {
        SignUpViewModel(mAuthUseCase = get())
    }
    viewModel {
        SplashViewModel(mAuthUseCase = get())
    }

    viewModel {
        LoginViewModel(mAuthUseCase = get())
    }
    viewModel {
        FetchNewsViewModel(mNewsUseCase = get(), mAuthUseCase = get())
    }
}
