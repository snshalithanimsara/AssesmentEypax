package com.shalitha.network.retrofit

import android.content.Context
import android.util.Log
import com.shalitha.network.ErrorResponseKeyConstants.KEY_ERROR
import com.shalitha.network.ErrorResponseKeyConstants.KEY_MESSAGE
import com.shalitha.network.R
import com.shalitha.network.state_models.Resource
import com.shalitha.network.state_models.ResourceState
import com.shalitha.network.utills.getKoinInstance
import org.json.JSONObject
import retrofit2.HttpException
import java.net.UnknownHostException

object ErrorHandler {

    fun getApiErrorMessage(error: Throwable?): Resource<String> {
        error?.printStackTrace()
        val mAppContext = getKoinInstance<Context>()

        var mError =
            Resource(
                data = "",
                message = mAppContext.getString(R.string.msg_something_went_wrong),
                state = ResourceState.ERROR
            )
        try {
            return when (error) {
                is HttpException -> {
                    mError.responseCode = error.code()
                    JSONObject(String(error.response()?.errorBody()?.bytes()!!)).also {
                        Log.e("ErrorHandler", it.toString())
                        when {
                            it.has(KEY_ERROR) -> {
                                mError.message = it.getString(KEY_ERROR)
                            }
                            it.has(KEY_MESSAGE) -> {
                                mError.message = it.getString(KEY_MESSAGE)
                            }

                        }
                    }
                    mError
                }
                is UnknownHostException -> {
                    mError.message = mAppContext.getString(R.string.msg_no_internet)
                    mError
                }
                else -> mError
            }
        } catch (e: Exception) {
            error?.printStackTrace()
        }
        return mError
    }
}
