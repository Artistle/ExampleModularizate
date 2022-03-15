package com.example.examplearchitecture

import android.app.Application
import android.content.Context
import com.example.core_di.CoreDi
import com.example.core_di.configuration.Configuration
import com.example.di_qualifier.DiQualifiers
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.qualifier.Qualifier
import org.koin.core.qualifier.QualifierValue
import org.koin.core.qualifier.named
import org.koin.dsl.module

class ExampleApplication: Application() {



    private val appDependencies = module {
        single<Configuration>(named(DiQualifiers.CONFIGURATION)) { ConfigurationImpl() }
        single<Context> { this@ExampleApplication }
    }

    override fun onCreate() {
        super.onCreate()

        CoreDi.modules.add(appDependencies)

        startKoin {
            androidLogger()
            androidContext(this@ExampleApplication)
            modules(CoreDi.modules)
        }
    }
}