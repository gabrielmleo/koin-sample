package com.example.koin_clean_architecture.presentation.view

import android.arch.lifecycle.MutableLiveData
import com.example.gleonardo.newssportspaginglibrary.data.model.PresentationResponse
import com.example.koin_clean_architecture.domain.usecase.GetNewsUseCase

class MainViewModel(var getNewsUseCase: GetNewsUseCase): BaseViewModel() {

    val newsLiveData = MutableLiveData<PresentationResponse>()


}