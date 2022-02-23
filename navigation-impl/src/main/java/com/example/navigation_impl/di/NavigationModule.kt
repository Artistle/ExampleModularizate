package com.example.navigation_impl.di

import com.example.navigation.Navigation
import com.example.navigation_impl.NavigationImpl
import org.koin.dsl.module

object NavigationModule {

    val module = module(createdAtStart = true) {
        single<Navigation> { NavigationImpl() }
    }
}