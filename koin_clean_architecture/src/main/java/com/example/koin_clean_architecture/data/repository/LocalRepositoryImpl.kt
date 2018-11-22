package com.example.koin_clean_architecture.data.repository

import com.example.gleonardo.newssportspaginglibrary.data.model.Response
import com.example.koin_clean_architecture.data.datasource.RemoteDataSource
import com.example.koin_clean_architecture.domain.repository.Repository
import io.reactivex.Single

class LocalRepositoryImpl(private var remoteDataSource: RemoteDataSource): Repository {
    override fun getNews(): Single<Response> {
        return remoteDataSource.getNews()
    }

}