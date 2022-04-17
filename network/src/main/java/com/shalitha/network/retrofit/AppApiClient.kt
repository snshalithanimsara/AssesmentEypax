package com.shalitha.network.retrofit

import android.util.Log
import com.shalitha.network.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

const val REQUEST_TIMEOUT: Long = 25L


fun createAppApiClient(
    baseUrl: String
): Retrofit = retrofitClient(
    baseUrl,
    initOkHttpObject()
)

private fun retrofitClient(
    baseUrl: String,
    okHttpClient: OkHttpClient
): Retrofit =
    Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(okHttpClient)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()


private fun initOkHttpObject(
): OkHttpClient {
    val TAG = "<--APICLIENT-->"

    val httpClient: OkHttpClient.Builder = OkHttpClient.Builder()
        .connectTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
        .readTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
        .writeTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)


    if (BuildConfig.DEBUG) {

        /**
         *  Adding a Logger a To Retrofit for Debugging Purposes
         */
        val loggerInterceptor = HttpLoggingInterceptor { message ->
            Log.e(TAG, message)
        }.also { mHttpLoggingInterceptor ->
            mHttpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        }
        httpClient.addInterceptor(interceptor = loggerInterceptor)
    }

    return httpClient.build()
}




