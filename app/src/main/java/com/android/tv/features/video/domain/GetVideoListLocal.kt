package com.android.tv.features.video.domain

import com.android.tv.features.video.data.VideoRepository
import javax.inject.Inject

class GetVideoListLocal @Inject constructor(
    private val videoRepository: VideoRepository
) {
    operator fun invoke() = videoRepository.getVideoListLocal()
}
