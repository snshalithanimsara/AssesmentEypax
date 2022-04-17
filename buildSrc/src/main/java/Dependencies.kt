object ApplicationId {
    const val id = "com.shalitha.assessment"
}

object Modules {

    //App  Feature Layer
    const val app = ":app"

    //App Core extensions Layer
    const val core = ":core"

    //presentation Layer {styles and colors}
    const val presentation = ":presentation"

    //Retrofit And API Layer
    const val network = ":network"

    //Local db Layer
    const val localDb = ":localDb"
}


object Releases {
    const val versionCode = 1

    const val versionName = "1.0.1" // current live version
}

object Versions {

    const val compileSdk = 31
    const val buildToolsVersion = "31"

    const val minSdk = 19
    const val targetSdk = 31
    const val gradle_plugin = "4.1.3"

    const val kotlin = "1.5.31"

    const val ktx = "1.3.2"
    const val koin = "2.1.6"
    const val rxjava = "2.2.6"

    const val retrofit = "2.9.0"
    const val retrofitJson = "2.9.0"
    const val curlInterceptor = "0.1"


    const val lottieVersion = "5.0.3"
    const val roundedimageview = "2.3.0"
    const val spinKitView = "1.4.0"


    const val appcompat = "1.4.0"
    const val design = "1.4.0"
    const val cardview = "1.0.0"
    const val recyclerview = "1.2.1"
    const val constraintlayout = "2.1.2"
    const val coroutines = "1.5.2"

    const val lifecycle = "2.0.0"
    const val multidex = "2.0.1"
    const val swipeRefresh = "1.1.0"
    const val fragmentKtx = "1.2.5"
    const val fragment = "1.3.0"
    const val activityKtx = "1.2.3"
    const val liveDataKtx = "2.4.0"
    const val lifeCycleKtx = "2.4.0"

    const val okhttp = "4.9.0"


    const val circularImageView = "4.2.0"
    const val coilImageLoader = "1.1.0"

    const val pagingVersion = "3.0.1"
    const val toastyVersion = "1.5.2"
    const val gsonVersion = "2.8.9"
    const val shimmerLoadingVersion = "0.5.0@aar"
    const val roomVersion = "2.4.2"


}


object Kotlin {
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Androidx {

    const val gredle_plugin = "com.android.tools.build:gradle:3.2.1"

    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material_design = "com.google.android.material:material:${Versions.design}"
    const val cardview = "androidx.cardview:cardview:${Versions.cardview}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"

    const val mulidex = "androidx.multidex:multidex:${Versions.multidex}"

    const val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutines_android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    const val swipeRefresh =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefresh}"

}

object Ktx {
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
    const val fragment = "androidx.fragment:fragment:${Versions.fragment}"
    const val activityKtx = "androidx.activity:activity-ktx:${Versions.activityKtx}"
    const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveDataKtx}"
    const val lifeCycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleKtx}"
    const val kotlinCoreKtx = "androidx.core:core-ktx:${Versions.ktx}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.roomVersion}"
}

object AndroidJetPack {
    const val paging = "androidx.paging:paging-runtime:${Versions.pagingVersion}"
}

object Lifecycle {
    const val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    const val viewmodel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
}

object Externallib {
    const val lottieAnimations = "com.airbnb.android:lottie:${Versions.lottieVersion}"
    const val roundedImageView = "com.makeramen:roundedimageview:${Versions.roundedimageview}"
    const val spinKitView = "com.github.ybq:Android-SpinKit:${Versions.spinKitView}"

    const val circularImageView = "com.mikhaellopez:circularimageview:${Versions.circularImageView}"
    const val coilImageLoader = "io.coil-kt:coil:${Versions.coilImageLoader}"
    const val toastyForCustomToast = "com.github.GrenderG:Toasty:${Versions.toastyVersion}"
    const val googleGson = "com.google.code.gson:gson:${Versions.gsonVersion}"
    const val facebookShimmerLoading =
        "com.facebook.shimmer:shimmer:${Versions.shimmerLoadingVersion}"


}

object ApiLiveServer {
    const val url = "\"https://newsapi.org/v2/\""
}

object ApiDemoServer {
    const val url = "\"https://newsapi.org/v2/\""
}

object API_KEY {
    const val api_key = "\"1763c14b4ba24809af0fdc87dd5f8fcf\""
}


object Retrofit {
    const val runtime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitJson}"
    const val rxjava2 = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val curl_logger =
        "com.github.grapesnberries:curlloggerinterceptor:${Versions.curlInterceptor}"
}

object Okhttp {
    const val runtime = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
}

object Reactivex {
    const val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"
}

object Koin {
    const val android = "org.koin:koin-android:${Versions.koin}"
    const val viewmodel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val scope = "org.koin:koin-androidx-scope:${Versions.koin}"
    const val ext = "org.koin:koin-android-ext:${Versions.koin}"

}

object RoomDb {
    const val roomRuntime = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomAnnotationProcessor = "androidx.room:room-compiler:${Versions.roomVersion}"
}