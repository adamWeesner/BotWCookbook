plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId = "com.weesnerdevelopment.botwcookbook"
        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            applicationIdSuffix = ".$name"
        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Config.Versions.compose
        kotlinCompilerVersion = Config.Versions.composeCompiler
    }
}

dependencies {
    implementation(Config.Libs.kotlinStdLib)
    implementation(Config.Libs.coreKtx)
    implementation(Config.Libs.material)
    implementation(Config.Libs.composeUi)
    implementation(Config.Libs.composeMaterial)
    implementation(Config.Libs.composeUiTooling)
    implementation(Config.Libs.androidXLifecycleRuntime)
    testImplementation(Config.Libs.jUnit)
    androidTestImplementation(Config.Libs.androidXJUnitExt)
    androidTestImplementation(Config.Libs.androidXEspresso)
}