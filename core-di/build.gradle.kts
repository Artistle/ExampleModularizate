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
//    implementation(project(":network"))
//    implementation(project(":repositories"))
//    implementation(project(":database"))
    implementation(project(":database-impl"))
    implementation(project(":network-impl"))
    implementation(project(":repositories-impl"))
    implementation(project(":navigation-impl"))
    implementation(project(":features:main-impl"))
}