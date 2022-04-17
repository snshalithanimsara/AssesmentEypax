package com.shalitha.core.extensions

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.shalitha.presentation.R


/**
 * show alert with less code base
 */
fun AppCompatActivity.showAlert(
    message: String,
    isCancellable: Boolean = true,
    title: String = getString(R.string.title_alert),
    okActionText: String,
    okAction: (() -> Unit)? = null,
    negativeAction: (() -> Unit)? = null
): AlertDialog {
    return alert(title, message) {
        cancelable = isCancellable
        positiveButton(okActionText) {
            okAction?.invoke()
        }
        negativeAction?.let {
            negativeButton(getString(R.string.action_cancel)) {
                negativeAction.invoke()
            }
        }

    }.also {
        if (it.isShowing)
            it.dismiss()
        it.show()
    }
}