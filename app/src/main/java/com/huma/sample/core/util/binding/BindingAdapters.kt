package com.huma.sample.core.util.binding

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.huma.sample.core.util.loadImageWithGlide

@BindingAdapter("setImageUrl")
fun setImageUrl(imageView: ImageView, url: String?) {
    imageView.loadImageWithGlide(url)
}

@BindingAdapter("setVisibilityGone")
fun setVisibilityGone(view: View, isGone: Boolean) {
    view.visibility = if (isGone) View.GONE else View.VISIBLE
}

@BindingAdapter("setVisibilityInvisible")
fun setVisibilityInvisible(view: View, isInvisible: Boolean) {
    view.visibility = if (isInvisible) View.INVISIBLE else View.VISIBLE
}

@BindingAdapter("setDisable")
fun setDisable(view: View, isLoading: Boolean) {
    view.isEnabled = !isLoading
}
