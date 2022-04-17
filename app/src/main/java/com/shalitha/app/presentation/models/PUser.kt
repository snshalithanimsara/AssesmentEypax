package com.shalitha.app.presentation.models

/**
 *  @Author Shalitha Samarasinghe
 *  @Create  2022-04-16 .
 */
data class PUser(
    val firstName: String,
    val secondName: String,
    val email: String,
    val password: String,
    var isCurrentLoggedInUser: Int = 0
)