package com.example.a6thp2

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class StaticFragmentDemoCall2 : Fragment() {
    lateinit var v1:View
    lateinit var textview:TextView
    companion object {
        fun newInstance() = StaticFragmentDemoCall2()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v1= inflater.inflate(R.layout.fragment_static_fragment_demo_call2, container, false)
        return v1
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    fun onFragmentInteraction(msg:String) {
        Log.d("K202",msg)
        textview= v1.findViewById(R.id.tv1)
        textview.setText(msg)
    }


}