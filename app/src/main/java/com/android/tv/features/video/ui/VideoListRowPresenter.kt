package com.android.tv.features.video.ui

import androidx.leanback.widget.FocusHighlight
import androidx.leanback.widget.ListRowPresenter
import androidx.leanback.widget.RowHeaderView
import androidx.leanback.widget.RowPresenter

class VideoListRowPresenter : ListRowPresenter(FocusHighlight.ZOOM_FACTOR_XSMALL) {

    override fun onBindRowViewHolder(holder: RowPresenter.ViewHolder?, item: Any?) {
        super.onBindRowViewHolder(holder, item)
        val textView =
            holder?.headerViewHolder?.view?.findViewById<RowHeaderView>(androidx.leanback.R.id.row_header)
        textView?.run {}
    }
}
