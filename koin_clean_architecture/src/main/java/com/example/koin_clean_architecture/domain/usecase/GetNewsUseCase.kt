package com.example.koin_clean_architecture.domain.usecase

import com.example.gleonardo.newssportspaginglibrary.data.model.DomainResponse
import com.example.koin_clean_architecture.domain.model.BaseRequestValues
import com.example.koin_clean_architecture.domain.repository.Repository
import io.reactivex.Flowable

class GetNewsUseCase(var repository: Repository) : BaseUseCase<BaseRequestValues, DomainResponse>() {
    override fun executeUseCase(requestValues: BaseRequestValues?): Flowable<DomainResponse> {
        return repository.getNews().toFlowable()
    }
}