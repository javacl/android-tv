package com.huma.sample.features.video.data

import com.huma.sample.core.db.AppDb
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class VideoLocalDataSource @Inject constructor(
    private val appDb: AppDb,
    private val videoDao: VideoDao
) {
}
