package com.shalitha.app.data.datasource

import com.shalitha.app.presentation.models.PUser


interface AuthLocalDataSource {

    suspend fun createNewUser(pUser: PUser): Boolean

    suspend fun getCurrentLoggedInUser(): PUser?

    suspend fun updateUser(pUser: PUser): Boolean

    suspend fun findUserWithThisEmail(email: String): PUser?
}