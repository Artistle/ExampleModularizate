import com.example.buildsrc.Dependencies.addCoreDependencies

com.example.buildsrc.AndroidSdk.compile

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android { compileSdk = com.example.buildsrc.AndroidSdk.compile }

dependencies {

    addCoreDependencies()

    implementation(project(":features::auth-impl"))
    implementation(project(":features:main-impl"))
}