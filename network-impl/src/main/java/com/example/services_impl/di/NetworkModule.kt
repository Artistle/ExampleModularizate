package com.example.services_impl.di

import com.example.di_qualifier.DiQualifiers
import com.example.services.Network
import com.example.services.ServiceFactory
import com.example.services_impl.NetworkImpl
import com.example.services_impl.ServiceFactoryImpl
import org.koin.core.qualifier.named
import org.koin.dsl.module

object NetworkModule {

    val module = module(createdAtStart = true) {
        factory<Network> { NetworkImpl() }
        factory<ServiceFactory> { ServiceFactoryImpl(get(named(DiQualifiers.CONFIGURATION))) }
    }
}