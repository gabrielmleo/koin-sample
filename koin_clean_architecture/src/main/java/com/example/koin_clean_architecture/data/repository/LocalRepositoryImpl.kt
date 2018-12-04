package com.example.koin_clean_architecture.data.repository

import com.example.gleonardo.newssportspaginglibrary.data.model.DomainResponse
import com.example.koin_clean_architecture.data.datasource.LocaDataSource
import com.example.koin_clean_architecture.data.mapper.ResponseMapper
import com.example.koin_clean_architecture.domain.repository.Repository
import io.reactivex.Single

class LocalRepositoryImpl(private var localDataSource: LocaDataSource) : Repository {
    override fun getNews(): Single<DomainResponse> {
        return localDataSource
                .getNews()
                .map { response ->
                    ResponseMapper.transformFrom(response)
                }
    }
}