package com.huma.sample.core.api

import com.huma.sample.core.exception.Exceptions
import com.huma.sample.core.model.ApiResult
import com.huma.sample.core.util.errorParser
import retrofit2.Response
import javax.inject.Inject

open class BaseRemoteDataSource {

    @Inject
    lateinit var urls: ApiUrlHelper

    protected fun <T> checkApiResult(response: Response<T>): ApiResult<T> {
        if (response.isSuccessful) {
            val body = response.body()
            if (body != null)
                return ApiResult.Success(body)
        }
        val error = errorParser(response.errorBody()?.string())
        return ApiResult.Error(
            Exceptions.RemoteDataSourceException(
                error.status,
                error.message,
                response.code()
            )
        )
    }
}
