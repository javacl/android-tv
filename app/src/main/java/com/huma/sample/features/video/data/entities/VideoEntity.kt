package com.huma.sample.features.video.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class VideoEntity(
    @PrimaryKey val id: Int = 0
)
