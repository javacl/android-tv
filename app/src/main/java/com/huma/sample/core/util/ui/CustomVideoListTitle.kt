package com.huma.sample.core.util.ui

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.leanback.widget.TitleViewAdapter
import com.huma.sample.R

class CustomVideoListTitle @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs), TitleViewAdapter.Provider {

    private val mTvTitle by lazy {
        findViewById<TextView>(R.id.tv_title_customVideoListTitle)
    }

    init {
        View.inflate(context, R.layout.custom_video_list_title, this)
        gravity = Gravity.CENTER
    }

    private val mTitleViewAdapter = object : TitleViewAdapter() {

        override fun getSearchAffordanceView(): View? {
            return null
        }

        override fun setTitle(titleText: CharSequence?) {
            this@CustomVideoListTitle.setTitle(titleText)
        }
    }

    override fun getTitleViewAdapter(): TitleViewAdapter {
        return mTitleViewAdapter
    }

    fun setTitle(title: CharSequence?) {
        if (title != null) {
            mTvTitle.text = title
        }
    }
}
