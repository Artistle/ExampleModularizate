package com.example.database_impl

import androidx.room.RoomDatabase
import com.example.database.UserDatabase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UserDatabaseImpl(
    context: RoomDatabase
): UserDatabase {

    override fun getUser(): Flow<String> {
        return flow {
            emit("")
        }
    }

    override fun testContent() {

    }


}