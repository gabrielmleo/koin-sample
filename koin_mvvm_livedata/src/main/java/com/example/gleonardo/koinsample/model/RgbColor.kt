package com.example.gleonardo.koinsample.model

data class RgbColor (var red:Int,
                     var green: Int,
                     var blue: Int) {
    companion object {
        const val ALPHA_VALUE = 255
    }
}