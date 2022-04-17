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