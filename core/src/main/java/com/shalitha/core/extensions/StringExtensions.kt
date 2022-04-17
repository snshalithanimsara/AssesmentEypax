package com.shalitha.core.extensions

import java.math.BigInteger
import java.security.MessageDigest

/**
 *  @Author Shalitha Samarasinghe
 *  @Create  2022-04-16 .
 */
fun String.generateMd5Hash(): String {
    val md = MessageDigest.getInstance("MD5")
    return BigInteger(1, md.digest(this.toByteArray())).toString(16).padStart(32, '0')
}