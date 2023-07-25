plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {
    //testImplementation(platform("org.junit:junit-bom:5.9.1"))
    //testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation ("io.rest-assured:rest-assured:5.3.1")
    testImplementation ("io.rest-assured:json-schema-validator:5.1.1")
    testImplementation ("org.junit.jupiter:junit-jupiter:5.6.1")
}

tasks.test {
    useJUnitPlatform()
}