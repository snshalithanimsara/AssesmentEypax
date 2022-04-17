package com.shalitha.app.utills

import android.os.Handler
import android.os.Looper
import com.shalitha.app.utills.AppModuleConstants.CONST_FAKE_DELAY_LENGTH_FOR_UI_NAVIGATION
import com.shalitha.core.extensions.CONST_DATE_TIME_FORMAT_SERVER_TIMESTAMP
import java.text.SimpleDateFormat
import java.util.*


fun String.parseServerTimesStampDateStringAsDate(): Date? {
    SimpleDateFormat(
        CONST_DATE_TIME_FORMAT_SERVER_TIMESTAMP,
        Locale.ENGLISH
    ).also { simpleDateFormat ->
        return simpleDateFormat.parse(this)
    }
}

/**
 * helper to run the UI navigation with a delay
 */
fun executeThisWithDelay(
    function: () -> Unit,
    delayingMillis: Long = CONST_FAKE_DELAY_LENGTH_FOR_UI_NAVIGATION
) {
    Handler(Looper.getMainLooper()).postDelayed({
        function()
    }, delayingMillis)
}