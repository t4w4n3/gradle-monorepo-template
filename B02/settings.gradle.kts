plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

rootProject.name = "B02"
includeBuild("../buildLogic")
include("B02M01", "B02M02")
includeBuild("../B01")
