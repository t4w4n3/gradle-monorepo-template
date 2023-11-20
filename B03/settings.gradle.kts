plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

rootProject.name = "B03"
includeBuild("../buildLogic")
include("B03M01", "B03M02")
includeBuild("../B01")
includeBuild("../B02")
