plugins {
    id("java")
}



group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:7.10.2")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.22.0")



}

tasks.test {
    useJUnitPlatform()
}