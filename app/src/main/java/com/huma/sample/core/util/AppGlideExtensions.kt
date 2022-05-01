package com.huma.sample.core.util

import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

object AppGlideExtensions {

    fun default(): RequestOptions {
        return RequestOptions()
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
    }
}
