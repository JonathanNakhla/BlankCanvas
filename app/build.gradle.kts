plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinxSerialization)
    id(BuildPlugins.kotlinAndroidExtensions)
}

android {
    compileSdkVersion(BuildVersions.targetSdk)
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    defaultConfig {
        applicationId = "com.jonathannakhla.nytimesdemo"
        minSdkVersion(BuildVersions.minSdk)
        targetSdkVersion(BuildVersions.targetSdk)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Kotlin.stdlib)
    implementation(Kotlin.serializationRuntime)
    implementation(RxLibraries.rxjava)
    implementation(RxLibraries.rxandroid)
    implementation(NetworkLibraries.retrofit)
    implementation(NetworkLibraries.rxjavaCallAdapter)
    implementation(NetworkLibraries.retrofitKotlinxSerializationConverter)
    implementation(SupportLibraries.supportAppCompat)
    implementation(UiLibraries.constraintLayout)
    implementation(UiLibraries.recyclerview)
    implementation(UiLibraries.cardview)
    implementation(DiLibraries.koin)
    implementation(DiLibraries.koinViewModel)
    implementation(ToolsLibraries.glide)

    debugImplementation(ToolsLibraries.leakCanary)

    testImplementation(TestLibraries.junit)
    testImplementation(TestLibraries.mockk)
}
