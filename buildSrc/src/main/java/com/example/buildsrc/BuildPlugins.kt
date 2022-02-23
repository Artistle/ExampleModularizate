package com.example.buildsrc

object BuildPlugins {

    object BuildVersions {
        const val buildToolsVersion = "7.0.2"
        const val googleServicesVersion = "4.3.3"
        const val appdistributionVersion = "2.0.1"
        const val roomToolsVersion = "2.4.0-rc01"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${BuildVersions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val googleServicesGradlePlugin = "com.google.gms:google-services:${BuildVersions.googleServicesVersion}"
    const val appdistributionGradlePlugin = "com.google.firebase:firebase-appdistribution-gradle:${BuildVersions.appdistributionVersion}"
}