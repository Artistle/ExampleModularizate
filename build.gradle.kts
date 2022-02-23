
plugins {
    kotlin("android") version "1.6.10" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }
    dependencies {
        classpath(com.example.buildsrc.BuildPlugins.androidGradlePlugin)
        classpath(com.example.buildsrc.BuildPlugins.kotlinGradlePlugin)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }
}

// todo реализовать шаблонную конфигурацию всех модулей
//subprojects {
//    configure<com.android.build.gradle.BaseExtension> {
//        compileSdkVersion(compile)
//    }
//}
