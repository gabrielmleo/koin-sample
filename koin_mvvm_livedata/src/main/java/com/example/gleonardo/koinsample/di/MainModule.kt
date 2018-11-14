package com.example.gleonardo.koinsample.di

import com.example.gleonardo.koinsample.view.MainViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModelModule = module {

    viewModel { MainViewModel() }
}