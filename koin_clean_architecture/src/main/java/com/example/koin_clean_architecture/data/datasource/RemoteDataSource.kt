package com.example.koin_clean_architecture.data.datasource

import com.example.gleonardo.newssportspaginglibrary.data.model.Response
import io.reactivex.Single

interface RemoteDataSource {
    fun getNews(): Single<Response>
}