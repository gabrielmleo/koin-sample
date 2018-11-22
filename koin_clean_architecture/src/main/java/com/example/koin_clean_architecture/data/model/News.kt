package com.example.gleonardo.newssportspaginglibrary.data.model

import com.example.koin_clean_architecture.data.model.Source
import com.google.gson.annotations.SerializedName

data class News (
        @SerializedName("source") val source: Source? = null,
        @SerializedName("author") val author: String? =null,
        @SerializedName("title") val title: String? = null,
        @SerializedName("description") val description: String? = null,
        @SerializedName("url") val url: String? = null,
        @SerializedName("urlToImage") val image: String,
        @SerializedName("publishedAt") val publishedAt: String? = null,
        @SerializedName("content") val content: String? = null
)