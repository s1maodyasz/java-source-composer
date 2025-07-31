plugins {
    id("java")
    alias(libs.plugins.spotless)
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

spotless {
    java {
        target("**/*.java")
        googleJavaFormat()
        removeUnusedImports()
        trimTrailingWhitespace()
        endWithNewline()
        indentWithTabs(2)
    }
}