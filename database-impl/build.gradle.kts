import com.example.buildsrc.AndroidSdk.compile
import com.example.buildsrc.Dependencies.addCoreDependencies

plugins {
    id("com.android.library")
    kotlin("android")
}

android { compileSdk = compile }

dependencies {

    addCoreDependencies()

    api(project(":database"))
}
