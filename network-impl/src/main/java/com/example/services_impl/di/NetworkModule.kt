package com.example.services_impl.di

import com.example.services.Network
import com.example.services_impl.NetworkImpl
import org.koin.dsl.module

object NetworkModule {

    val module = module(createdAtStart = true) {
        factory<Network> { NetworkImpl() }
    }
}