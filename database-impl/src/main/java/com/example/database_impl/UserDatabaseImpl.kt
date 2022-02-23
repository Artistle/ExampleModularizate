package com.example.database_impl

import com.example.database.UserDatabase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UserDatabaseImpl : UserDatabase {

    override fun getUser(): Flow<String> = flow {
        emit("User from database")
    }
}