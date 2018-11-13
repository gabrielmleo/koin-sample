package com.example.gleonardo.koinsample

import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModelModule = module {

    viewModel { MainViewModel() }
}