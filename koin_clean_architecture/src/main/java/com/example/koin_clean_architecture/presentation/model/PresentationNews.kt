package com.example.gleonardo.newssportspaginglibrary.data.model

import com.example.koin_clean_architecture.data.model.PresentationSource

data class PresentationNews(
        val source: PresentationSource? = null,
        val author: String? = null,
        val title: String? = null,
        val description: String? = null,
        val url: String? = null,
        val image: String? = null,
        val publishedAt: String? = null,
        val content: String? = null
)