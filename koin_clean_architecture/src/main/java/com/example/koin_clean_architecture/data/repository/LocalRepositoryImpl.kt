package com.example.koin_clean_architecture.data.repository

import com.example.gleonardo.newssportspaginglibrary.data.model.DomainResponse
import com.example.koin_clean_architecture.data.datasource.RemoteDataSource
import com.example.koin_clean_architecture.data.mapper.PresentationResponseMapper
import com.example.koin_clean_architecture.domain.repository.Repository
import io.reactivex.Single

class LocalRepositoryImpl(private var remoteDataSource: RemoteDataSource) : Repository {
    override fun getNews(): Single<DomainResponse> {
        return remoteDataSource
                .getNews()
                .map { response ->
                    PresentationResponseMapper.transformFrom(response)
                }
    }
}