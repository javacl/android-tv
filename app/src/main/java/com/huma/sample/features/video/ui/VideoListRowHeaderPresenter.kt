package com.huma.sample.features.video.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.Presenter
import androidx.leanback.widget.RowHeaderPresenter
import com.huma.sample.R

class VideoListRowHeaderPresenter : RowHeaderPresenter() {

    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_video_list_row_header, parent, false)
        return VideoListHeaderViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: Presenter.ViewHolder, item: Any) {
        super.onBindViewHolder(viewHolder, item)
        if (viewHolder is VideoListHeaderViewHolder)
            viewHolder.onBind((item as ListRow).headerItem.name)
    }

    class VideoListHeaderViewHolder(view: View) : ViewHolder(view) {

        private val tvTitle by lazy {
            view.findViewById<TextView>(R.id.tv_title_itemVideoListRowHeader)
        }

        fun onBind(title: String) {
            tvTitle.text = title
        }
    }
}
