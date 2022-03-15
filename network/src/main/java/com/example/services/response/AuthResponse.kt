package com.example.services.response

import com.google.gson.annotations.SerializedName

data class AuthResponse(

    @SerializedName("username")
    val userName: String,

    @SerializedName("company")
    val company: String

)