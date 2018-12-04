package com.example.gleonardo.newssportspaginglibrary.data.model

import com.example.koin_clean_architecture.data.model.Source

data class News(
        val source: Source? = null,
        val author: String? = null,
        val title: String? = null,
        val description: String? = null,
        val url: String? = null,
        val image: String? = null,
        val publishedAt: String? = null,
        val content: String? = null
)