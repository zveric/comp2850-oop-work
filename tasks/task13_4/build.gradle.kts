plugins {
    kotlin("jvm") version "2.2.0"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.0")
    testImplementation("io.kotest:kotest-runner-junit5:5.9.1")
    testImplementation("io.kotest:kotest-assertions-core:5.9.1")
    testImplementation("io.mockk:mockk:1.13.13")
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass = "MainKt"
}

tasks.withType<Test>().configureEach {
    jvmArgs = listOf("-XX:+EnableDynamicAgentLoading")
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
