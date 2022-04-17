package com.shalitha.app.domain.usecases


import com.shalitha.app.domain.repository.AuthRepository
import com.shalitha.app.presentation.models.PUser


class AuthUseCase(private val mAuthRepository: AuthRepository) {

    suspend fun createNewUser(pUser: PUser): Boolean = mAuthRepository.createNewUser(pUser = pUser)

    suspend fun getCurrentLoggedInUser(): PUser? = mAuthRepository.getCurrentLoggedInUser()

    suspend fun findUserWithThisEmail(email: String): PUser? =
        mAuthRepository.findUserWithThisEmail(email = email)

    suspend fun setThisAsCurrentLoggedInUser(email: String): Boolean =
        mAuthRepository.setThisAsCurrentLoggedInUser(email = email)

    suspend fun logoutCurrentLoggedInUser(): Boolean = mAuthRepository.logoutCurrentLoggedInUser()

}