package com.huma.sample.features.video.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.leanback.app.BrowseSupportFragment
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class VideoListFragment : BrowseSupportFragment() {

    private val viewModel by viewModels<VideoListViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initValue()
        initView()
        initObservation()
    }

    private fun initValue() {}

    private fun initView() {}

    private fun initObservation() {

        lifecycleScope.launch {

            viewModel.videoList.collect {
                adapter = it
            }
        }
    }
}
