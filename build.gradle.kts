// build.gradle.kts (Project Level)
plugins {
    kotlin("jvm") version "1.8.22"
    id("com.android.application") version "8.2.0"
    id("org.jetbrains.kotlin.kapt") version "1.8.22"
    id("androidx.navigation.safeargs.kotlin") version "2.7.0"
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.22")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
