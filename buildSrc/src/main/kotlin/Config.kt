object Config {
    object Versions {
        const val gradleBuildTools = "4.2.0-alpha16"
        const val kotlin = "1.4.20"

        const val composeCompiler = "1.4.10"

        const val compose = "1.0.0-alpha04"
        const val material = "1.2.1"

        const val coreKtx = "1.3.2"

        const val lifecycleRuntime = "2.3.0-beta01"

        const val jUnit = "4.13.1"
        const val androidXJUnit = "1.1.2"
        const val androidXEspresso = "3.3.0"

    }

    object Libs {
        const val kotlinStdLib =
            "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
        const val coreKtx =
            "androidx.core:core-ktx:${Versions.coreKtx}"
        const val material =
            "com.google.android.material:material:${Versions.material}"
        const val composeUi =
            "androidx.compose.ui:ui:${Versions.compose}"
        const val composeMaterial =
            "androidx.compose.material:material:${Versions.compose}"
        const val composeUiTooling =
            "androidx.ui:ui-tooling:${Versions.compose}"
        const val androidXLifecycleRuntime =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}"
        const val jUnit =
            "junit:junit:${Versions.jUnit}"
        const val androidXJUnitExt =
            "androidx.test.ext:junit:${Versions.androidXJUnit}"
        const val androidXEspresso =
            "androidx.test.espresso:espresso-core:${Versions.androidXEspresso}"
    }

    object BuildPlugins {
        const val gradleBuildTools =
            "com.android.tools.build:gradle:${Versions.gradleBuildTools}"
        const val kotlinGradlePlugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    }
}