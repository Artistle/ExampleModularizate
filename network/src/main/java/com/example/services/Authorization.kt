package com.example.services

import com.example.services.response.AuthResponse
import retrofit2.http.GET

interface Authorization {

    @GET("authUser")
    fun auth(): AuthResponse
}