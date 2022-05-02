package com.huma.sample.features.video.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.leanback.widget.Presenter
import com.huma.sample.R

class VideoListPresenter : Presenter() {

    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_video_list,
            parent,
            false
        )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, item: Any) {}

    override fun onUnbindViewHolder(viewHolder: ViewHolder) {}
}
