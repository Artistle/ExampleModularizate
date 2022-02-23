package com.example.main_impl.di

import com.example.main.MainFeature
import com.example.main_impl.MainFeatureImpl
import org.koin.dsl.module

object MainFeatureModule {

    val module = module {

        factory<MainFeature> { MainFeatureImpl() }
    }
}