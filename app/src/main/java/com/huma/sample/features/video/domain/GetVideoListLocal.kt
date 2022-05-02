package com.huma.sample.features.video.domain

import com.huma.sample.features.video.data.VideoRepository
import javax.inject.Inject

class GetVideoListLocal @Inject constructor(
    private val videoRepository: VideoRepository
) {
    operator fun invoke() = videoRepository.getVideoListLocal()
}
