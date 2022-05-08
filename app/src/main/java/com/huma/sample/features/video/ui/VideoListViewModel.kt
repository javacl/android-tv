package com.huma.sample.features.video.ui

import androidx.lifecycle.ViewModel
import com.huma.sample.features.video.domain.GetVideoListLocal
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class VideoListViewModel @Inject constructor(
    getVideoListLocal: GetVideoListLocal
) : ViewModel() {

    val videoList = getVideoListLocal()
}
