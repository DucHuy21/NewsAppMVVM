package com.example.newsappmvvm.ui.fragments.lifeAndSociety

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.newsappmvvm.R
import com.example.newsappmvvm.ui.NewsActivity
import com.example.newsappmvvm.viewmodel.NewsViewModel
import kotlinx.android.synthetic.main.item_web_view.*

class EntertainmentTwo : Fragment(R.layout.item_web_view) {
    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
        webViewItemOne.apply {
            webViewClient = WebViewClient()
            loadUrl("https://thegioidienanh.vn/")
        }
    }
}