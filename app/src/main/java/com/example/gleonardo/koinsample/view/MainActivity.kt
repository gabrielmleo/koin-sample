package com.example.gleonardo.koinsample.view

import android.arch.lifecycle.Observer
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.gleonardo.koinsample.R
import com.example.gleonardo.koinsample.model.RgbColor
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        subscribeToColorLiveData()
        changeColorButton.setOnClickListener {
            mainViewModel.getRandomColor()
        }
    }

    fun subscribeToColorLiveData() {
        mainViewModel.colorLiveData.observe(this, Observer { color ->
            color?.let {
                changeBackgroundColorWithColor(it)
            }
        })
    }

    fun changeBackgroundColorWithColor(color: RgbColor) {
        with(color) {
            backgroundView.setBackgroundColor(
                    Color.argb(RgbColor.ALPHA_VALUE, this.red, this.green, this.blue)
            )
        }
    }


}
