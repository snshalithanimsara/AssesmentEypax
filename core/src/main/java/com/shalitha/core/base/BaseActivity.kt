package com.shalitha.core.base

import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.shalitha.core.R
import com.shalitha.core.extensions.showAlert
import es.dmoral.toasty.Toasty


open class BaseActivity : AppCompatActivity() {


    private var progressDialog: Dialog? = null
    private var isPaused: Boolean? = null
    private var mCurrentShowingAlertDialog: AlertDialog? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initProgressDialog()
    }

    /**
     * initialize progress dialog
     */
    private fun initProgressDialog() {
        progressDialog = Dialog(this@BaseActivity).apply {
            this.setContentView(R.layout.progress_dialog)
            this.setCancelable(false)
            this.window?.setBackgroundDrawableResource(android.R.color.transparent)
        }
    }

    fun showAlertWithMessage(alertMessage: String, okAction: (() -> Unit)? = null) {
        mCurrentShowingAlertDialog = showAlert(
            message = alertMessage,
            isCancellable = false,
            title = getString(R.string.title_alert),
            okActionText = getString(R.string.action_ok),
            okAction = {
                okAction?.invoke()
            })
    }

    /**
     *showing an toast message , when there is no internet
     */
    fun showInternetNotAvailableToast() = Toasty.info(
        this@BaseActivity,
        getString(R.string.msg_no_internet),
        Toast.LENGTH_SHORT,
        true
    ).show()


    /**
     * show Progress Dialog
     */
    fun showProgressDialog() {
        progressDialog?.show()
    }


    /**
     * hide Progress dialog
     */
    fun hideProgressDialog() {
        progressDialog?.dismiss()
    }

    override fun onDestroy() {
        mCurrentShowingAlertDialog?.dismiss()
        hideProgressDialog()
        super.onDestroy()
    }


    override fun onResume() {
        isPaused = false
        super.onResume()
    }
}