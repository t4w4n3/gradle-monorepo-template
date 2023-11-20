plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

dependencies {
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

println("Building module ${project.group}:${project.name}")

tasks.compileKotlin {
    println("task $name for module ${project.group}:${project.name}")
}
