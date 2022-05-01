package com.huma.sample.features.video.data

import com.huma.sample.core.db.AppDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class VideoModule {

    @Singleton
    @Provides
    fun provideVideoService(retrofit: Retrofit): VideoService {
        return retrofit.create(VideoService::class.java)
    }

    @Singleton
    @Provides
    fun provideVideoDao(appDb: AppDb): VideoDao {
        return appDb.videoDao()
    }
}
