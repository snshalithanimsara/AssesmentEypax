package com.shalitha.app.domain.repository

import com.shalitha.app.presentation.models.PFetchNewsResponse


interface NewsRepository {

    suspend fun fetchNewsWithSearchQuery(searchQuery: String?): PFetchNewsResponse?

    suspend fun fetchBreakingNewsList(countryCode: String): PFetchNewsResponse?


}