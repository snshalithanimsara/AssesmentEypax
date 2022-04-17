package com.shalitha.app.domain.repository

import com.shalitha.app.presentation.models.PUser


interface AuthRepository {

    suspend fun createNewUser(pUser: PUser): Boolean

    suspend fun setThisAsCurrentLoggedInUser(email: String): Boolean

    suspend fun getCurrentLoggedInUser(): PUser?

    suspend fun findUserWithThisEmail(email: String): PUser?

    suspend fun logoutCurrentLoggedInUser(): Boolean


}