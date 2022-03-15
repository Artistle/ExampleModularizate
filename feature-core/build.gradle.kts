import com.example.buildsrc.AndroidSdk.compile
import com.example.buildsrc.Dependencies.addCoreDependencies
import com.example.buildsrc.Dependencies.addNavigationDependencies
import com.example.buildsrc.Libraries.fragmentKtx
import com.example.buildsrc.Libraries.viewModelKtx
import com.example.buildsrc.Libraries.viewModelSavedState

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android { compileSdk = compile }

dependencies {

    addCoreDependencies()
    addNavigationDependencies()

    implementation(project(":di-qualifier"))
    api(project(":entity"))
    api(fragmentKtx)
    api(viewModelKtx)
    api(viewModelSavedState)
}