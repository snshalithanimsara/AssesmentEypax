package com.shalitha.localdb.di

import androidx.room.Room
import com.shalitha.localdb.DbRelatedConstants.KEY_DB_NAME
import com.shalitha.localdb.db.UserRoomDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val localDbModule = module {
    single {
        Room.databaseBuilder(
            androidApplication(),
            UserRoomDatabase::class.java,
            KEY_DB_NAME
        ).fallbackToDestructiveMigration().build()
    }
    single { get<UserRoomDatabase>().userDao() }
}