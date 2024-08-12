# BIN Checker App

## Overview

The BIN Checker app is a versatile tool designed to validate and manage Bank Identification Numbers (BIN). This application allows users to quickly check the details associated with a BIN, view and manage historical data, and maintain a list of favorite BINs. It features a user-friendly interface with customizable themes and smooth transitions, providing a seamless experience for both casual users and professionals.

## Features

- **Home Screen**: Enter and validate BIN numbers with instant feedback.
- **History**: Access and review previously checked BIN numbers.
- **Favorites**: Save and quickly access frequently used BINs.
- **Settings**: Customize the app’s appearance with light, dark, or system default themes.
- **Splash Screen**: A visually appealing splash screen with animation during app launch.

## Getting Started

### Prerequisites

- **Android Studio**: Integrated development environment (IDE) for Android development.
- **Android SDK**: Software development kit necessary for app development and testing.
- **An Emulator or Physical Device**: To run and test the app.

### Installation

1. **Clone the Repository**
    ```bash
    git clone https://github.com/papaguycodes/binchecker.git
    cd binchecker
    ```

2. **Build the Project**
    ```bash
    ./gradlew clean build
    ```

3. **Install the App on an Emulator or Device**
    ```bash
    adb install -r app/build/outputs/apk/debug/app-debug.apk
    ```

4. **Launch the App**
    ```bash
    adb shell am start -n com.papaguycodes.binchecker/.MainActivity
    ```

### Usage

- **Home Screen**: Enter a BIN number to check its details. Results will be displayed instantly.
- **History**: View a list of previously validated BIN numbers.
- **Favorites**: Add BINs to your favorites for quick access.
- **Settings**: Choose your preferred theme for the app interface.

## Dependencies

This app utilizes several key libraries and frameworks:

- **AndroidX Libraries**: Core components and UI elements.
- **Room**: Database library for local data persistence.
- **Navigation Component**: Manages app navigation.
- **Jetpack Compose**: Modern UI toolkit for building native interfaces.
- **Kotlin Coroutines**: Handles asynchronous operations efficiently.

## Special Thanks

I extend our gratitude to the developers and communities behind the following tools and libraries that contributed to the success of this project:

- **AndroidX Libraries**: [AndroidX](https://developer.android.com/jetpack/androidx)
- **Room Persistence Library**: [Room](https://developer.android.com/topic/libraries/architecture/room)
- **Navigation Component**: [Android Navigation](https://developer.android.com/guide/navigation)
- **Jetpack Compose**: [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **Kotlin Coroutines**: [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html)

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgements

Thank you to the open-source community for providing the libraries and tools that made this project possible.
