package com.shalitha.app.datasource.local


import com.shalitha.app.data.datasource.AuthLocalDataSource
import com.shalitha.app.presentation.models.PUser
import com.shalitha.app.utills.checkIsResultSuccess
import com.shalitha.core.extensions.mapTo
import com.shalitha.localdb.dao.UserDao


class AuthLocalDataSourceImpl(private val mUserDao: UserDao) :
    AuthLocalDataSource {

    override suspend fun createNewUser(pUser: PUser): Boolean =
        mUserDao.insert(user = pUser.mapTo()).toInt().checkIsResultSuccess()

    override suspend fun getCurrentLoggedInUser(): PUser? =
        mUserDao.getCurrentLoggedInUser()?.mapTo()

    override suspend fun logoutCurrentLoggedInUser(): Boolean =
        mUserDao.logoutCurrentLoggedInUser().checkIsResultSuccess()

    override suspend fun setThisAsCurrentLoggedInUser(email: String): Boolean =
        mUserDao.setThisAsCurrentLoggedInUser(emailString = email).checkIsResultSuccess()

    override suspend fun findUserWithThisEmail(email: String): PUser? =
        mUserDao.findUserWithThisEmail(emailString = email)?.mapTo()
}