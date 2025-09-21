import com.vanniktech.maven.publish.portal.SonatypeCentralPortal
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.composeHotReload)
    //`maven-publish`
    id("com.vanniktech.maven.publish") version "0.34.0"


}



kotlin {
    jvmToolchain(17)
    androidTarget {

        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
        publishLibraryVariants("release")
    }

    listOf(iosArm64(), iosSimulatorArm64()).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "IntellijIconsCompose"
            isStatic = true
        }
    }

    jvm()

    js {
        browser()
        binaries.library()
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
        binaries.library()
    }

    sourceSets {
        androidMain.dependencies {
            implementation(compose.preview)
        }
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodelCompose)
            implementation(libs.androidx.lifecycle.runtimeCompose)

        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
        jvmMain.dependencies {
            implementation(compose.desktop.currentOs)
            implementation(libs.kotlinx.coroutinesSwing)
        }
    }
}

android {
    namespace = "io.github.xcodebn.intellijiconscompose"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17 // was 11
        targetCompatibility = JavaVersion.VERSION_17 // was 11
    }
}

dependencies {
    debugImplementation(compose.uiTooling)
}


mavenPublishing {


    coordinates(
        groupId = "io.github.xcodebn",
        artifactId = "intellij-icons-compose",
        version = "1.0.0"
    )

    pom {
        name.set("Intellij Icons CMP")
        description.set("JetBrains IntelliJ-style icons as a Compose Multiplatform library")
        inceptionYear.set("2025")
        url.set("https://github.com/xcodebn/IntellijIconsCompose")

        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }

        developers {
            developer {
                id.set("xcodebn")
                name.set("Hassan Bazzoun")
                email.set("hassan.bazzoundev@gmail.com")
            }
        }

        scm {
            url.set("https://github.com/xcodebn/IntellijIconsCompose")
        }
    }

    publishToMavenCentral()
    signAllPublications()
}