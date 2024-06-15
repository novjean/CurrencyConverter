// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val kotlinVersion by extra("1.8.20")

    repositories{
        google()
        mavenCentral()

    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.28.3-alpha")
    }
}

plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}