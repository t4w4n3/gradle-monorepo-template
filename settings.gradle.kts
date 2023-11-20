plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

rootProject.name = "gradle-monorepo"

includeBuild("buildLogic")
includeBuild("B01")
includeBuild("B02")
includeBuild("B03")
