import com.example.buildsrc.AndroidSdk.compile

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android { compileSdk = compile }

dependencies {

}