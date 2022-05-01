package com.huma.sample.core.util.binding

import android.view.View
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingAdapter
import com.huma.sample.core.util.loadImageWithGlide

@BindingAdapter("setImageUrl")
fun setImageUrl(imageView: AppCompatImageView, url: String?) {
    imageView.loadImageWithGlide(url)
}

@BindingAdapter("setIcon")
fun setIcon(imageView: AppCompatImageView, icon: Int) {
    if (icon != 0) {
        val drawable = AppCompatResources.getDrawable(imageView.context, icon)
        imageView.setImageDrawable(drawable)
    }
}

@BindingAdapter("setBackground")
fun setBackground(view: View, background: Int) {
    if (background != 0) {
        val drawable = AppCompatResources.getDrawable(view.context, background)
        view.background = drawable
    }
}

@BindingAdapter("setVisibilityGone")
fun setVisibilityGone(view: View, isGone: Boolean) {
    view.visibility = if (isGone) View.GONE else View.VISIBLE
}

@BindingAdapter("setVisibilityInvisible")
fun setVisibilityInvisible(view: View, isInvisible: Boolean) {
    view.visibility = if (isInvisible) View.INVISIBLE else View.VISIBLE
}

@BindingAdapter("setServerErrorMessage", "setResourceErrorMessage")
fun setErrorMessage(
    textView: AppCompatTextView,
    serverErrorMessage: String?,
    resourceErrorMessage: Int
) {
    if (serverErrorMessage == null) {
        if (resourceErrorMessage != 0)
            textView.setText(resourceErrorMessage)
    } else textView.text = serverErrorMessage
}

@BindingAdapter("setDisable")
fun setDisable(view: View, isLoading: Boolean) {
    view.isEnabled = !isLoading
}
