package com.example.a6thp2

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class ColorFragmentDemo1 : Fragment() {
    lateinit var buttonGreen:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val v = inflater.inflate(R.layout.fragment_color_demo1, container, false)
        buttonGreen = v.findViewById(R.id.frag1btnGreen)
        buttonGreen.setOnClickListener {
            val mai = activity as ColorActivity
            mai.newColor(Color.CYAN)
        }
        return v
    }
}