plugins {
    id("java")
    alias(libs.plugins.spotless)
}

group = "com.github.s1maodyasz"
version = "1.0.0-SNAPSHOT"

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
