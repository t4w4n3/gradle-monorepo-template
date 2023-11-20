plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

rootProject.name = "B01"
includeBuild("../buildLogic")
include("B01M01", "B01M02")
