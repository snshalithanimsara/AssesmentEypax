package com.shalitha.app.presentation.models

import com.google.gson.annotations.SerializedName

data class PFetchNewsResponse(

    @field:SerializedName("totalResults")
    val totalResults: Int? = null,

    @field:SerializedName("articles")
    val articles: List<PArticlesItem?>? = null,

    @field:SerializedName("status")
    val status: String? = null
)


