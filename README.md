# IntelliJ Icons Compose Multiplatform

![Kotlin](https://img.shields.io/badge/kotlin-multiplatform-blue.svg?style=flat)
![Compose Multiplatform](https://img.shields.io/badge/Compose-Multiplatform-blue)
![Maven Central](https://img.shields.io/maven-central/v/io.github.xcodebn/intellij-icons-compose.svg)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)
![Platform](https://img.shields.io/badge/platform-android%20%7C%20ios%20%7C%20desktop%20%7C%20web-lightgrey)

Browse all 8000+ IntelliJ Platform icons in a Compose Multiplatform library.

A Compose port of https://intellij-icons.jetbrains.design/

## Library

Add the dependency to your project:

```kotlin
dependencies {
    implementation("io.github.xcodebn:intellij-icons-compose:1.0.0")
}
```

## Usage

Access all icons through the `IntellijIconsCompose` object:

```kotlin
import github.xcodebn.intellijiconscompose.IntellijIconsCompose

// Example usage
Icon(
    imageVector = IntellijIconsCompose.Archive,
    contentDescription = "Archive"
)
```

## Targets

- Android
- iOS  
- Desktop (JVM)
- Web (JS)

> **Note**: This library hasn't been fully tested on all platforms yet. Testers and feedback are appreciated!

## Demo App

Run the demo app to browse all available icons:

```shell
./gradlew :composeApp:run
```

## License

MIT License - Icons are from the IntelliJ Platform (Apache 2.0). See [LICENSE](LICENSE) for details.