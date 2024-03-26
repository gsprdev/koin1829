plugins {
    kotlin("jvm")
    `java-library`
    `maven-publish`
}

group = "org.example.koin1829"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.insert-koin:koin-core:3.4.3")
}

kotlin {
    jvmToolchain(17)
}

publishing {
    publications {
        create<MavenPublication>("release") {
            artifactId = "library"
            from(components["java"])
        }
    }
}
