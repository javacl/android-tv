package com.huma.sample.features.video.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.Presenter
import androidx.leanback.widget.PresenterSelector
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class VideoListFragment : BrowseSupportFragment() {

    private val viewModel by viewModels<VideoListViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initValue()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initObservation()
    }

    private fun initValue() {

        headersState = HEADERS_DISABLED
        setHeaderPresenterSelector(object : PresenterSelector() {
            override fun getPresenter(item: Any?): Presenter {
                return VideoListRowHeaderPresenter()
            }
        })
    }

    private fun initView() {}

    private fun initObservation() {

        lifecycleScope.launch {

            viewModel.videoList.collect {
                adapter = it
            }
        }
    }
}
