plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.starstruckstech.pgpodandroid"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.starstruckstech.pgpodandroid"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures{
        compose=true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    
    viewBinding {
        enable = true
    }
    

    viewBinding {
        enable = true

    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.2"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.runtime.livedata)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.fuel)
    implementation(libs.androidx.core.ktx.v1120)

    //FireBase Dependencies
    implementation(libs.firebase.auth)
    implementation(libs.firebase.database)
    implementation(libs.firebase.firestore)
    implementation(libs.firebase.storage)
    implementation (libs.firebase.ui.database)
    implementation(libs.firebase.ui.database)
    implementation(libs.firebase.messaging)
    implementation(libs.firebase.database.v2030)
    implementation(libs.firebase.core)
    implementation(libs.firebase.firestore.v2480)

    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation (libs.glide)
    implementation(libs.shadowlayout)
    implementation (libs.circleimageview)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.core)
    implementation (libs.converter.gson)
    implementation (libs.retrofit)
    implementation (libs.shimmer)
    implementation(libs.timber)
    implementation(libs.glide)
    implementation(libs.shadowlayout)
    implementation(libs.circleimageview)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.converter.gson)
    implementation(libs.retrofit)
    implementation(libs.timber)
    implementation(libs.shimmer)
    implementation(libs.generativeai)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.coil.compose)
    implementation(libs.androidx.material)
    implementation(libs.androidx.navigation.fragment.ktx.v276)
    implementation(libs.androidx.navigation.ui.ktx.v276)
    implementation (libs.play.services.maps)
    implementation(libs.play.services.location)
}