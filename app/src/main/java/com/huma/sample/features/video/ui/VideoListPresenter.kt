package com.huma.sample.features.video.ui

import android.view.ViewGroup
import androidx.leanback.widget.ImageCardView
import androidx.leanback.widget.Presenter
import com.huma.sample.R
import com.huma.sample.core.util.binding.setImageUrl
import com.huma.sample.features.video.data.entities.VideoEntity


class VideoListPresenter : Presenter() {

    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        val imageCardView = object : ImageCardView(parent.context) {}
        imageCardView.isFocusable = true
        imageCardView.isFocusableInTouchMode = true
        return ViewHolder(imageCardView)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, item: Any) {

        val data = item as VideoEntity

        val imageCardView = viewHolder.view as ImageCardView
        val res = imageCardView.resources
        val width: Int = res.getDimensionPixelSize(R.dimen.item_video_width)
        val height: Int = res.getDimensionPixelSize(R.dimen.item_video_height)
        imageCardView.setMainImageDimensions(width, height)

        setImageUrl(imageCardView.mainImageView, data.poster)
        imageCardView.titleText = data.titleFa
        imageCardView.contentText = data.titleEn
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder) {}
}
