plugins {
    id("java")
    id("application")
}

group = "io.github.ricardoandradem"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("io.github.ricardoandradem.ContaTerminal")
}

repositories {
    mavenCentral()
}

tasks.withType<JavaExec> {
    standardInput = System.`in`
}