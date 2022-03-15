package com.example.features_di

import com.example.auth.Authorization
import com.example.auth_impl.AuthorizationImpl
import com.example.main.MainFeature
import com.example.main_impl.MainFeatureImpl
import org.koin.core.module.Module
import org.koin.dsl.module

object FeaturesModule {

    val featuresModules: Module = module {
        factory<Authorization> { AuthorizationImpl() }
        factory<MainFeature> { MainFeatureImpl() }
    }
}