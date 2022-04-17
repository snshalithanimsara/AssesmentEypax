package com.shalitha.localdb.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.shalitha.localdb.entities.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(user: User): Long

    @Query("DELETE FROM user")
    suspend fun deleteAll()

    @Query("SELECT *  FROM user where isCurrentUser=1")
    suspend fun getCurrentLoggedInUser(): User?


    @Query("SELECT *  FROM user where email=(:emailString)")
    suspend fun findUserWithThisEmail(emailString: String): User?

    @Query("UPDATE user SET isCurrentUser = 0 WHERE isCurrentUser =1")
    suspend fun logoutCurrentLoggedInUser(): Int

    @Query("UPDATE user SET isCurrentUser = 1 WHERE  email=(:emailString)")
    suspend fun setThisAsCurrentLoggedInUser(emailString: String): Int

}