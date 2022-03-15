package com.example.auth_impl.di

import com.example.auth.Authorization
import com.example.auth_impl.AuthorizationImpl
import org.koin.dsl.module

object AuthorizationModule {

    val modules = module {
        factory<Authorization> { AuthorizationImpl() }
    }
}