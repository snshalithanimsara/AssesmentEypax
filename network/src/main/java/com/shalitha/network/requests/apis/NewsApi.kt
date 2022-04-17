package com.shalitha.network.requests.apis

import com.shalitha.network.BuildConfig
import com.shalitha.network.requests.models.FetchNewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

@JvmSuppressWildcards
interface NewsApi {

    @GET("everything")
    suspend fun fetchNewsWithSearchQuery(
        @Query("q") query: String? = "Apple",
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY
    ): FetchNewsResponse?

    @GET("top-headlines")
    suspend fun fetchBreakingNewsList(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY
    ): FetchNewsResponse?

}
