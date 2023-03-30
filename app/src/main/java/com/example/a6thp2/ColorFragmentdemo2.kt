package com.example.a6thp2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.LinearLayout

class ColorFragmentdemo2 : Fragment() {
    lateinit var parent: LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_color_fragmentdemo2, container, false)
        parent = v.findViewById(R.id.frag2parent)
        return v
    }

    fun updateColor(c:Int) {
        parent.setBackgroundColor(c)
    }
}