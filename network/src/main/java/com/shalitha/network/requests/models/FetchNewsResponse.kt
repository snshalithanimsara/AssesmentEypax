package com.shalitha.network.requests.models

import com.google.gson.annotations.SerializedName

data class FetchNewsResponse(

    @field:SerializedName("totalResults")
    val totalResults: Int? = null,

    @field:SerializedName("articles")
    val articles: List<ArticlesItem?>? = null,

    @field:SerializedName("status")
    val status: String? = null
)


