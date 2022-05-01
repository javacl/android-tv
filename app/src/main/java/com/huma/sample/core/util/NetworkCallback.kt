package com.huma.sample.core.util

interface NetworkCallback {
    fun refresh()
    fun retry() = refresh()
}
