package com.example.gleonardo.koinsample

import android.app.Application
import com.example.gleonardo.koinsample.di.viewModelModule
import org.koin.android.ext.android.startKoin

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(viewModelModule))
    }
}