package com.example.koin_clean_architecture.domain.usecase

import com.example.koin_clean_architecture.domain.model.BaseRequestValues
import io.reactivex.Flowable

abstract class BaseUseCase<in RV: BaseRequestValues, T> {

    private var requestValue: RV? = null

    fun setRequestValues(requestValues: RV?) {
        this.requestValue = requestValues
    }

    fun run(): Flowable<T> {
        return executeUseCase(requestValue)
    }

    abstract fun executeUseCase(requestValues: RV? = null): Flowable<T>
}