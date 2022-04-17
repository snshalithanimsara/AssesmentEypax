package com.shalitha.app.presentation.models

import com.google.gson.annotations.SerializedName

data class PSource(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: Any? = null
)
