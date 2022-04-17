package com.shalitha.app.datasource.remote


import com.shalitha.app.data.datasource.NewsRemoteDataSource
import com.shalitha.app.presentation.models.PFetchNewsResponse
import com.shalitha.core.extensions.mapTo
import com.shalitha.network.requests.apis.NewsApi


class NewsRemoteDataSourceImpl(private val mNewsApi: NewsApi) :
    NewsRemoteDataSource {

    override suspend fun fetchNewsWithSearchQuery(searchQuery: String?): PFetchNewsResponse? =
        mNewsApi.fetchNewsWithSearchQuery(query = searchQuery)?.mapTo()

    override suspend fun fetchBreakingNewsList(countryCode: String): PFetchNewsResponse? =
        mNewsApi.fetchBreakingNewsList(country = countryCode)?.mapTo()
}