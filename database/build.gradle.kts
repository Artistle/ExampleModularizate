import com.example.buildsrc.AndroidSdk.compile
import com.example.buildsrc.Dependencies.addCoreDependencies
import com.example.buildsrc.Dependencies.addRoomDependencies

plugins {
    id("com.android.library")
    kotlin("android")
}

android { compileSdk = compile }

dependencies {

    addCoreDependencies()
    addRoomDependencies()

    implementation(project(":di-qualifier"))
}