package com.example.gleonardo.koinsample

import android.arch.lifecycle.ViewModel
import android.graphics.Color
import java.util.*

class MainViewModel: ViewModel() {

    fun getRandomColor(): Int {
        val random = Random()
        val color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))
        return color
    }
}