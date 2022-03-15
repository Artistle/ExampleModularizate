import com.example.buildsrc.AndroidSdk.compile
import com.example.buildsrc.Dependencies.addCoreDependencies
import com.example.buildsrc.Dependencies.addCoreViewDependencies

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android { compileSdk = compile }

dependencies {

    addCoreDependencies()
    addCoreViewDependencies()
    implementation(project(":di-qualifier"))
    /**
     *
     * TODO подключение необходимых библиотек методом api()
     */
}