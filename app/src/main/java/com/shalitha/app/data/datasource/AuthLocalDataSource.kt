package com.shalitha.app.data.datasource

import com.shalitha.app.presentation.models.PUser


interface AuthLocalDataSource {

    suspend fun createNewUser(pUser: PUser): Boolean

    suspend fun getCurrentLoggedInUser(): PUser?

    suspend fun setThisAsCurrentLoggedInUser(email: String): Boolean

    suspend fun findUserWithThisEmail(email: String): PUser?

    suspend fun logoutCurrentLoggedInUser(): Boolean
}