plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.example.koin1829"
version = "1.0-SNAPSHOT"

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
