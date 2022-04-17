package com.shalitha.app

import android.app.Application
import com.shalitha.app.di.mDataSourceModule
import com.shalitha.app.di.mRepositoryModule
import com.shalitha.app.di.mUseCaseModule
import com.shalitha.app.di.viewModelModule
import com.shalitha.localdb.di.localDbModule
import com.shalitha.network.di.retrofitNetworkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * All the DI components will be initialized here
 */
class ApplicationCore : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ApplicationCore)
            // declare modules
            modules(
                listOf(
                    retrofitNetworkModule,
                    localDbModule,
                    mUseCaseModule, mRepositoryModule, mDataSourceModule, viewModelModule
                )


            )
        }

    }

}