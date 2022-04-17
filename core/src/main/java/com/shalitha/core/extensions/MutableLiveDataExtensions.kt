package com.shalitha.core.extensions


import androidx.lifecycle.MutableLiveData
import com.shalitha.network.state_models.Resource
import com.shalitha.network.state_models.ResourceState


fun <T> MutableLiveData<Resource<T>>.setSuccess(data: T?, message: String?) =
    postValue(Resource(ResourceState.SUCCESS, data, message))

fun <T> MutableLiveData<Resource<T>>.setLoading() =
    postValue(
        Resource(
            ResourceState.LOADING,
            value?.data
        )
    )

fun <T> MutableLiveData<Resource<T>>.setError(response: Resource<String>?) =
    postValue(
        Resource(
            ResourceState.ERROR,
            value?.data,
            message = response?.message,
            responseCode = response?.responseCode
        )
    )