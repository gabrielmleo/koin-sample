package com.example.gleonardo.newssportspaginglibrary.data.model

import com.example.koin_clean_architecture.data.model.DomainSource

data class DomainNews(
        val source: DomainSource? = null,
        val author: String? = null,
        val title: String? = null,
        val description: String? = null,
        val url: String? = null,
        val image: String? = null,
        val publishedAt: String? = null,
        val content: String? = null
)