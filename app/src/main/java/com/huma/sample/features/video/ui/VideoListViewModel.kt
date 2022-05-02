package com.huma.sample.features.video.ui

import com.huma.sample.core.util.viewModel.BaseViewModel
import com.huma.sample.features.video.domain.GetVideoListLocal
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class VideoListViewModel @Inject constructor(
    getVideoListLocal: GetVideoListLocal
) : BaseViewModel() {

    val videoList = getVideoListLocal()

    override fun getData() {}
}
