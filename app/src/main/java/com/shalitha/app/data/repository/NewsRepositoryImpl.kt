package com.shalitha.app.data.repository


import com.shalitha.app.data.datasource.NewsRemoteDataSource
import com.shalitha.app.domain.repository.NewsRepository
import com.shalitha.app.presentation.models.PFetchNewsResponse

class NewsRepositoryImpl(private val mNewsRemoteDataSource: NewsRemoteDataSource) :
    NewsRepository {

    override suspend fun fetchNewsWithSearchQuery(searchQuery: String?): PFetchNewsResponse? =
        mNewsRemoteDataSource.fetchNewsWithSearchQuery(searchQuery = searchQuery)


    override suspend fun fetchBreakingNewsList(countryCode: String): PFetchNewsResponse? =
        mNewsRemoteDataSource.fetchBreakingNewsList(countryCode = countryCode)
}