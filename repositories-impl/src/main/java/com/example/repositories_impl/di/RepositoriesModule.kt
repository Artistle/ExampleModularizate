package com.example.repositories_impl.di

import com.example.repositories.Repositories
import com.example.repositories_impl.RepositoriesImpl
import org.koin.dsl.module

object RepositoriesModule {

    val module = module(createdAtStart = true) {
        factory<Repositories>{ RepositoriesImpl(get()) }
    }
}