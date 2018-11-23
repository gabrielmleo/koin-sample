package com.example.koin_clean_architecture.presentation.view

import android.arch.lifecycle.MutableLiveData
import com.example.gleonardo.newssportspaginglibrary.data.model.DomainResponse
import com.example.gleonardo.newssportspaginglibrary.data.model.PresentationResponse
import com.example.koin_clean_architecture.data.mapper.PresentationResponseMapper
import com.example.koin_clean_architecture.domain.usecase.GetNewsUseCase
import com.example.koin_clean_architecture.domain.utils.UseCaseHandler
import com.example.koin_clean_architecture.presentation.model.NewsRequestValue

class MainViewModel(var getNewsUseCase: GetNewsUseCase) : BaseViewModel() {

    val newsLiveData = MutableLiveData<PresentationResponse>()

    fun getNews() {
        val useCaseExecute = UseCaseHandler.execute(getNewsUseCase, NewsRequestValue(1))
        compositeDisposable
                .add(useCaseExecute.subscribe(
                        { t: DomainResponse? ->
                            val presentationResponse = PresentationResponseMapper.transformFrom(t)
                        },
                        {
                            //TODO mapper error case
                        }
                )
                )
    }
}