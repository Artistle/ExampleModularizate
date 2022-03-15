package com.example.database

import kotlinx.coroutines.flow.Flow

interface UserDatabase {

    fun getUser(): Flow<String>

    fun testContent()
}