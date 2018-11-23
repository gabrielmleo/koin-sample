package com.example.koin_clean_architecture.presentation.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.koin_clean_architecture.R
import com.example.koin_clean_architecture.presentation.view.components.NewsAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var newsListAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    private fun initAdapter() {
//        newsListAdapter = NewsAdapter()
//        newsRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
//        newsRecyclerView.adapter = newsListAdapter
//        viewModel.newsList.observe(this, Observer {
//            newsListAdapter.submitList(it)
//        })
//    }
}
