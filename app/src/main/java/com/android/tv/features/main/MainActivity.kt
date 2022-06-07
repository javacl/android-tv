package com.android.tv.features.main

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.android.tv.R
import com.android.tv.core.util.localizedContext
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun attachBaseContext(context: Context) {
        super.attachBaseContext(localizedContext(context))
    }

    override fun onStart() {
        super.onStart()
        localizedContext(this)
    }
}
