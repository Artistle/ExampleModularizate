package com.example.buildsrc

import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {

    /**
     * список самых базовых зависимостей для каждого модуля
     */
    fun DependencyHandler.addCoreDependencies() {
        impl(Libraries.coroutines)
        impl(Libraries.coreKtx)
        impl(Libraries.timber)
        addKoinDependencies()
    }

    fun DependencyHandler.addNavigationDependencies() {
        api(Libraries.cicerone)
    }

    /**
     * список зависимостей для features модулей, подключаеются фрагменты и вью элементы
     */
    fun DependencyHandler.addCoreViewDependencies() {
        impl(Libraries.material)
        impl(Libraries.appCompat)
        impl(Libraries.constraintLayout)
    }

    /**
     * зависимости для DI
     */
    private fun DependencyHandler.addKoinDependencies() {
        impl(Libraries.koin)
    }

    /**
     * список зависимостей для фич-модулей, содержит всё необходимое бля каждого модуля
     */
    fun DependencyHandler.addFeaturesDependencies() {
        api(Libraries.appCompat)
        api(Libraries.fragmentKtx)
        api(Libraries.fragmentTesting)
        api(Libraries.viewModelKtx)
        api(Libraries.viewModelSavedState)
        api(Libraries.liveDataKtx)
        api(Libraries.material)
        api(Libraries.constraintLayout)
        api(Libraries.recyclerView)
        api(Libraries.circleImageView)
    }

    fun DependencyHandler.addRoomDependencies() {
        impl(Libraries.room)
        impl(Libraries.roomCompiler)
        impl(Libraries.roomKtx)
    }

    /**
     * список зависимостей для работы с сетью
     */
    fun DependencyHandler.addNetworkDependencies() {
        api(Libraries.retrofit)
        api(Libraries.retrofitConverterGson)
        api(Libraries.okhttp3)
        api(Libraries.loggingInterceptor)
        //api(Libraries.chuck)
    }

    private fun DependencyHandler.api(depName: Any) {
        add("api", depName)
    }

    private fun DependencyHandler.impl(depName: Any) {
        add("implementation", depName)
    }

    private fun DependencyHandler.kapt(depName: Any) {
        add("kapt", depName)
    }

    private fun DependencyHandler.debud(depName: Any) {
        add("androidTestImplementation ", depName)
    }

    private fun DependencyHandler.compile(depName: Any) {
        add("compileOnly", depName)
    }
}