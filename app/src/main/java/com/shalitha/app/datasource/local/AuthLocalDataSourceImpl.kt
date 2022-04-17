package com.shalitha.app.datasource.local


import com.shalitha.app.data.datasource.AuthLocalDataSource
import com.shalitha.app.datasource.mapToLocalUser
import com.shalitha.app.presentation.models.PUser
import com.shalitha.core.extensions.mapTo
import com.shalitha.localdb.dao.UserDao
import com.shalitha.network.utills.checkIsResultSuccess


class AuthLocalDataSourceImpl(private val mUserDao: UserDao) :
    AuthLocalDataSource {

    override suspend fun createNewUser(pUser: PUser): Boolean =
        mUserDao.insert(user = pUser.mapToLocalUser()).also {
            it
        }.toInt().checkIsResultSuccess()

    override suspend fun getCurrentLoggedInUser(): PUser? =
        mUserDao.getCurrentLoggedInUser()?.mapTo()

    override suspend fun logoutCurrentLoggedInUser(): Boolean =
        mUserDao.logoutCurrentLoggedInUser().checkIsResultSuccess()

    override suspend fun updateUser(pUser: PUser): Boolean =
        mUserDao.updateUser(pUser.mapToLocalUser()).checkIsResultSuccess()

    override suspend fun findUserWithThisEmail(email: String): PUser? =
        mUserDao.findUserWithThisEmail(emailString = email)?.mapTo()
}