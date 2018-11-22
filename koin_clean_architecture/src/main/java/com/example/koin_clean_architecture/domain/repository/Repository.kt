package com.example.koin_clean_architecture.domain.repository

import com.example.gleonardo.newssportspaginglibrary.data.model.Response
import io.reactivex.Single

interface Repository {
    fun getNews(): Single<Response>
}