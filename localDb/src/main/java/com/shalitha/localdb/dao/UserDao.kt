package com.shalitha.localdb.dao

import androidx.room.*
import com.shalitha.localdb.entities.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(user: User): Long

    @Query("DELETE FROM user")
    suspend fun deleteAll()

    @Query("SELECT *  FROM user where isCurrentUser=1")
    suspend fun getCurrentLoggedInUser(): User?

    @Update
    suspend fun updateUser(user: User): Int

    @Query("SELECT *  FROM user where email=(:emailString)")
    suspend fun findUserWithThisEmail(emailString: String): User?

    @Query("UPDATE user SET isCurrentUser = 0 WHERE isCurrentUser =1")
    suspend fun logoutCurrentLoggedInUser(): Int

}