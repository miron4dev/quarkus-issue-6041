import io.quarkus.gradle.tasks.QuarkusBuild
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "com.miron4dev"
version = "1.0-SNAPSHOT"

plugins {
    kotlin("jvm") version "1.3.70"
    kotlin("plugin.allopen") version "1.3.70"
    id("io.quarkus") version "1.3.0.Final"
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation(enforcedPlatform("io.quarkus:quarkus-bom:1.3.0.Final"))
    implementation("io.quarkus:quarkus-kotlin")
    implementation("io.quarkus:quarkus-jackson")
    implementation("io.quarkus:quarkus-amazon-lambda")
}


tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            javaParameters = true
        }
    }
    withType<QuarkusBuild> {
        isUberJar = true
    }
    withType<Test> {
        useJUnitPlatform()
    }
}

allOpen {
    annotations("javax.enterprise.context.ApplicationScoped")
}

quarkus {
    setSourceDir("src/main/kotlin")
    setOutputDirectory("build/classes/kotlin/main")
}