package com.shalitha.network.di


import com.shalitha.network.BuildConfig
import com.shalitha.network.requests.apis.NewsApi
import com.shalitha.network.retrofit.createAppApiClient
import org.koin.dsl.module


//Koin DI modules for network should be added here


/**
 * Retrofit Client Module
 */


val retrofitNetworkModule = module {


//    //Create define API interface classes here
    single {
        val appApiClient =
            createAppApiClient(BuildConfig.API_URL)
        appApiClient.create(NewsApi::class.java)
    }
}


