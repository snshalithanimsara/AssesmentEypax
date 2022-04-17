package com.shalitha.core.extensions

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


/**
 * Use this to map class 1 to class 2 using json keys
 */
inline fun <reified T : Any> Any.mapTo(): T {
    val gson = Gson()
    val toJson = gson.toJson(this@mapTo)
    return gson.fromJson(toJson, object : TypeToken<T>() {}.type)
}
