package com.huma.sample.features.video.data

import com.huma.sample.core.util.NetworkHandler
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class VideoRepository @Inject constructor(
    private val videoLocalDataSource: VideoLocalDataSource,
    private val videoRemoteDataSource: VideoRemoteDataSource,
    private val networkHandler: NetworkHandler
) {

    fun getVideoListLocal() = videoLocalDataSource.getVideoList()
}
