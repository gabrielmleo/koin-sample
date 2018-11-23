package com.example.koin_clean_architecture.presentation.model

import com.example.gleonardo.newssportspaginglibrary.data.model.PresentationNews

sealed class NewsLiveDataStatus {
    data class StatusSuccess(var newsList: MutableList<PresentationNews?>?): NewsLiveDataStatus()
    data class StatusError(var throwable: Throwable?): NewsLiveDataStatus()
}