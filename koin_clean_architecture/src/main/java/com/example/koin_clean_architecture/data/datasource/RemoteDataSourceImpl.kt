package com.example.koin_clean_architecture.data.datasource

import com.example.gleonardo.newssportspaginglibrary.data.model.Response
import io.reactivex.Single

class RemoteDataSourceImpl(private var apiService: ApiService) : RemoteDataSource{
    override fun getNews(): Single<Response> {
        return apiService.getNews(1,30)
    }
}