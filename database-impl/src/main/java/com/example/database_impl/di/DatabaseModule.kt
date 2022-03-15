package com.example.database_impl.di

import com.example.database.UserDatabase
import com.example.database_impl.UserDatabaseImpl
import com.example.database_impl.database.AppDatabase
import org.koin.dsl.module

object DatabaseModule {

    val module = module {

        factory<UserDatabase> { UserDatabaseImpl(AppDatabase.invoke(get())) }
    }
}