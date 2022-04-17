package com.shalitha.network.utills

import org.koin.core.KoinComponent
import org.koin.core.inject

/**
 *inject dependencies to extension functions
 *
 * val imageManager = getKoinInstance<ImageManager>()
 */
inline fun <reified T> getKoinInstance(): T {
    return object : KoinComponent {
        val value: T by inject()
    }.value
}


fun Int?.checkIsResultSuccess(): Boolean {
    this?.let { resultInt ->
        return resultInt > 0
    } ?: kotlin.run {
        return false
    }
}
