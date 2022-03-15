package com.example.auth_impl

import com.example.auth.Authorization

class AuthorizationImpl: Authorization {

    override fun auth() {
        print("Success auth")
    }

    override fun logout() {
        print("Success logout")
    }
}