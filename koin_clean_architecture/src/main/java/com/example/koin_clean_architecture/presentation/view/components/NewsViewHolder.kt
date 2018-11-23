package com.example.koin_clean_architecture.presentation.view.components

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gleonardo.newssportspaginglibrary.data.model.PresentationNews
import com.example.koin_clean_architecture.R
import kotlinx.android.synthetic.main.news_item.view.*

class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(news: PresentationNews?) {
        if (news != null) {
            itemView.txt_news_name.text = news.title
//            Picasso.get().load(news.image).into(itemView.img_news_banner)
        }
    }

    companion object {
        fun create(parent: ViewGroup): NewsViewHolder {
            val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.news_item, parent, false)
            return NewsViewHolder(view)
        }
    }
}