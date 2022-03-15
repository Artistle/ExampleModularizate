import com.example.buildsrc.AndroidSdk.compile
import com.example.buildsrc.Dependencies.addCoreDependencies

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android { compileSdk = compile }

dependencies {

    addCoreDependencies()

    implementation(project(":di-qualifier"))
    implementation(project(":network-impl"))
}