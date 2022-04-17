package com.shalitha.localdb.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.shalitha.localdb.dao.UserDao
import com.shalitha.localdb.entities.User

// Annotates class to be a Room Database with a table (entity) of the Word class
@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class UserRoomDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
}