package com.huma.sample.core.model

import com.huma.sample.core.exception.Exceptions

sealed class ApiResult<out T> {

    data class Success<out T>(val data: T) : ApiResult<T>()

    data class Error<out T>(val exception: Exceptions, val data: T? = null) : ApiResult<T>()
}
