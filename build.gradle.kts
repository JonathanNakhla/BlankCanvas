// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
        maven { url = java.net.URI("https://oss.jfrog.org/libs-snapshot") }
    }
    dependencies {
        classpath (BuildPlugins.androidGradlePlugin)
        classpath (BuildPlugins.kotlinGradlePlugin)
        classpath (BuildPlugins.kotlinSerializationPlugin)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = java.net.URI("https://oss.jfrog.org/libs-snapshot") }
    }
}

tasks.register("clean").configure {
    delete("build")
}
