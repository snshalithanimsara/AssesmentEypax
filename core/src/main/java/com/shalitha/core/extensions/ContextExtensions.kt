package com.shalitha.core.extensions

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.annotation.RequiresPermission


/**
 * Checks network connectivity
 */
@RequiresPermission(Manifest.permission.ACCESS_NETWORK_STATE)
fun Context.isNetworkStatusAvailable(): Boolean {
    var mIsConnected = false

    val connectivityManager =
        this.getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager
    connectivityManager?.let {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val mActiveNetwork = connectivityManager.activeNetwork
            mActiveNetwork?.let { activeNetwork ->
                connectivityManager.getNetworkCapabilities(activeNetwork)
                    ?.also { mNetworkCapabilities ->
                        mIsConnected =
                            mNetworkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) || mNetworkCapabilities.hasTransport(
                                NetworkCapabilities.TRANSPORT_WIFI
                            )
                    }

            }

        } else {
            connectivityManager.activeNetworkInfo?.let { mNetworkInfo ->
                mIsConnected = mNetworkInfo.isConnected
            }
        }
    }
    return mIsConnected
}

/**
 * Execute block of code if network is available
 */
@RequiresPermission(Manifest.permission.ACCESS_NETWORK_STATE)
inline fun Context.withNetwork(available: () -> Unit, error: () -> Unit) {
    if (isNetworkStatusAvailable()) {
        available()
    } else {
        error()
    }
}


/**
 * Start Activity from context
 * */
inline fun <reified T : Activity> Context?.startActivity(func: Intent.() -> Unit) {
    val intent = Intent(this, T::class.java).apply {
        func()
    }
    this?.startActivity(intent)
}



