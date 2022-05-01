package com.huma.sample.core.model

data class AppListResponse<out T>(
    override val status: String = "",
    val data: List<T> = ArrayList()
) : AppResponse()
