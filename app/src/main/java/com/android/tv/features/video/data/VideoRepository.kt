package com.android.tv.features.video.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class VideoRepository @Inject constructor(
    private val videoLocalDataSource: VideoLocalDataSource
) {

    fun getVideoListLocal() = videoLocalDataSource.getVideoList()
}
