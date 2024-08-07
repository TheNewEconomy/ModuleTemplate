rootProject.name = "ModuleTemplate"

include(":TNE-Module")
project(":TNE-Module").projectDir = file("Module")


pluginManagement {
    repositories {
        maven("https://plugins.gradle.org/m2/")
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.8.0")
}