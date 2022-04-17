package com.shalitha.localdb.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
class User(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "firstName") val firstName: String,
    @ColumnInfo(name = "secondName") val secondName: String,
    @ColumnInfo(name = "email") val email: String,
    @ColumnInfo(name = "password") val password: String,
    @ColumnInfo(name = "isCurrentUser") var isCurrentUser: Int = 0
)