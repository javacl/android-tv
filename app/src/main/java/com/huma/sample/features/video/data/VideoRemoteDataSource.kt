package com.huma.sample.features.video.data

import com.huma.sample.core.api.BaseRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class VideoRemoteDataSource @Inject constructor(
    private val videoService: VideoService
) : BaseRemoteDataSource() {
}
