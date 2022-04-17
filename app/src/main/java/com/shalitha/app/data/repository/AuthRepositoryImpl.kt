package com.shalitha.app.data.repository


import com.shalitha.app.data.datasource.AuthLocalDataSource
import com.shalitha.app.domain.repository.AuthRepository
import com.shalitha.app.presentation.models.PUser

class AuthRepositoryImpl(private val mAuthLocalDataSource: AuthLocalDataSource) :
    AuthRepository {
    override suspend fun createNewUser(pUser: PUser): Boolean =
        mAuthLocalDataSource.createNewUser(pUser = pUser)

    override suspend fun getCurrentLoggedInUser(): PUser? =
        mAuthLocalDataSource.getCurrentLoggedInUser()

    override suspend fun updateUser(pUser: PUser): Boolean =
        mAuthLocalDataSource.updateUser(pUser = pUser)

    override suspend fun findUserWithThisEmail(email: String): PUser? =
        mAuthLocalDataSource.findUserWithThisEmail(email = email)
}