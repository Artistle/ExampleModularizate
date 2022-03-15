package com.example.core_di

import com.example.database_impl.di.DatabaseModule
import com.example.features_di.FeaturesModule
import com.example.navigation_impl.di.NavigationModule
import com.example.repositories_impl.di.RepositoriesModule
import com.example.services_impl.di.NetworkModule

object CoreDi {

    val modules = arrayListOf(
        DatabaseModule.module,
        NetworkModule.module,
        RepositoriesModule.module,
        NavigationModule.module,
        FeaturesModule.featuresModules
    )

}