package com.example.koin_clean_architecture.domain.utils

import com.example.koin_clean_architecture.domain.model.BaseRequestValues
import com.example.koin_clean_architecture.domain.usecase.BaseUseCase
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object UseCaseHandler {

    fun <RV : BaseRequestValues, T> execute(useCase: BaseUseCase<RV, T>, values: RV? = null): Flowable<T> {
        useCase.setRequestValues(values)
        return useCase.run()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
    }
}