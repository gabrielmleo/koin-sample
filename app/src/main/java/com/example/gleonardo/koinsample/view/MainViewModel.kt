package com.example.gleonardo.koinsample.view

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.gleonardo.koinsample.model.RgbColor
import java.util.*

class MainViewModel : ViewModel() {

    val colorLiveData = MutableLiveData<RgbColor>()

    fun getRandomColor() {
        val random = Random()
        val rgbColor = RgbColor(random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256))
        colorLiveData.value = rgbColor
    }
}