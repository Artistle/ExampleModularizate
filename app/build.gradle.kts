import com.example.buildsrc.AndroidSdk.compile
import com.example.buildsrc.AndroidSdk.min
import com.example.buildsrc.AndroidSdk.target
import com.example.buildsrc.Dependencies.addCoreDependencies
import com.example.buildsrc.Dependencies.addCoreViewDependencies
import com.example.buildsrc.Dependencies.addNavigationDependencies

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {

    defaultConfig {
        applicationId = "com.example.examplearchitecture"
        minSdk = min
        targetSdk = target
        compileSdk = compile
        versionCode = 1
        versionName = "1.0"

        javaCompileOptions {
            annotationProcessorOptions {
                arguments += mapOf(
                    "room.schemaLocation" to "$projectDir/schemas",
                    "room.incremental" to "true",
                    "room.expandProjection" to "true"
                )
            }
        }
    }

    configurations {
        implementation.get().exclude(mapOf("group" to "org.jetbrains", "module" to "annotations"))
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
        getByName("debug") {
            applicationIdSuffix = ".debug"
            isDebuggable = true
            isShrinkResources = false
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    applicationVariants.all {
        outputs.forEach { output ->
            if (output is com.android.build.gradle.internal.api.BaseVariantOutputImpl) {
                output.outputFileName = "${applicationId}-v$versionName-$versionCode.${output.outputFile.extension}"
            }
        }
    }
}

dependencies {

    addCoreDependencies()
    addCoreViewDependencies()
    addNavigationDependencies()

    implementation(project(":di-qualifier"))
    api(project(":core-di"))
    api(project(":network"))
    api(project(":navigation"))
    api(project(":features:main"))
}