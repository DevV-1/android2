package com.example.a6thp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ColorActivity : AppCompatActivity(),ColorInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)
    }

    override fun newColor(color: Int) {
        val f=supportFragmentManager.findFragmentByTag("frag2") as ColorFragmentdemo2
        f.updateColor(color)
    }

}