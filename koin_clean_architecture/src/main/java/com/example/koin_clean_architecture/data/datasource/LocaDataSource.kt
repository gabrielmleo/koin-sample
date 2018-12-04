package com.example.koin_clean_architecture.data.datasource

import com.example.gleonardo.newssportspaginglibrary.data.model.Response
import io.reactivex.Single

interface LocaDataSource {
    fun getNews(): Single<Response>
}