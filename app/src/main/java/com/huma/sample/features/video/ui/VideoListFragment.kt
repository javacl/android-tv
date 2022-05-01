package com.huma.sample.features.video.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.huma.sample.R
import com.huma.sample.core.util.ui.BaseFragment
import com.huma.sample.databinding.FragmentVideoListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class VideoListFragment : BaseFragment<FragmentVideoListBinding>() {

    private val viewModel by viewModels<VideoListViewModel>()

    override val layoutId: Int
        get() = R.layout.fragment_video_list

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initValue()
        initView()
        initObservation()
    }

    private fun initValue() {}

    private fun initView() {}

    private fun initObservation() {}
}
