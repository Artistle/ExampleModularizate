import com.example.buildsrc.AndroidSdk.compile
import com.example.buildsrc.Dependencies.addCoreDependencies
import com.example.buildsrc.Dependencies.addFeaturesDependencies
import com.example.buildsrc.Dependencies.addNavigationDependencies

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android { compileSdk = compile }

dependencies {

    addCoreDependencies()
    addNavigationDependencies()
    addFeaturesDependencies()

    implementation(project(":di-qualifier"))
    implementation(project(":feature-core"))
    api(project(":features:main"))
}