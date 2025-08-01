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

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}