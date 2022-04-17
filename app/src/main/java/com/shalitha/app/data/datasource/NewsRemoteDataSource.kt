package com.shalitha.app.data.datasource

import com.shalitha.app.presentation.models.PFetchNewsResponse


interface NewsRemoteDataSource {

    suspend fun fetchNewsWithSearchQuery(searchQuery: String?): PFetchNewsResponse?

    suspend fun fetchBreakingNewsList(countryCode: String): PFetchNewsResponse?
}