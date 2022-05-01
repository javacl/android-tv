package com.huma.sample.core.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.huma.sample.features.video.data.VideoDao
import com.huma.sample.features.video.data.entities.VideoEntity

@Database(
    entities = [
        VideoEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDb : RoomDatabase() {

    abstract fun videoDao(): VideoDao
}
