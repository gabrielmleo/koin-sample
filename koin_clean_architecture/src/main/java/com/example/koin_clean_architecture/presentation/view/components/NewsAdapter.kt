package com.example.koin_clean_architecture.presentation.view.components

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.gleonardo.newssportspaginglibrary.data.model.PresentationNews

class NewsAdapter(private val newsList: MutableList<PresentationNews>) : RecyclerView.Adapter<NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): NewsViewHolder {
        return NewsViewHolder.create(parent)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(newsViewHolder: NewsViewHolder, position: Int) {
        val news = newsList[position]
        newsViewHolder.bind(news)
    }
}