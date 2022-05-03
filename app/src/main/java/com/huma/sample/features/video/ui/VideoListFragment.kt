package com.huma.sample.features.video.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.leanback.app.VerticalGridSupportFragment
import androidx.leanback.widget.ArrayObjectAdapter
import androidx.leanback.widget.Presenter
import androidx.leanback.widget.PresenterSelector
import androidx.leanback.widget.VerticalGridPresenter
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class VideoListFragment : VerticalGridSupportFragment() {

    private val viewModel by viewModels<VideoListViewModel>()

    private lateinit var videoListAdapter: ArrayObjectAdapter

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

        val verticalGridPresenter = VerticalGridPresenter()
        verticalGridPresenter.numberOfColumns = 10
        gridPresenter = verticalGridPresenter

        videoListAdapter = ArrayObjectAdapter()
        videoListAdapter.presenterSelector = object : PresenterSelector() {
            override fun getPresenter(item: Any?): Presenter {
                return VideoListPresenter()
            }
        }
        adapter = videoListAdapter
    }

    private fun initView() {}

    private fun initObservation() {

        lifecycleScope.launch {

            viewModel.videoList.collect {
                videoListAdapter.addAll(0, it)
            }
        }
    }
}
