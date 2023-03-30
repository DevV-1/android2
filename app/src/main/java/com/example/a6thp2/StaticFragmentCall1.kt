package com.example.a6thp2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class StaticFragmentCall1 : Fragment() {
    lateinit var v:View
    companion object {
        fun newInstance() = StaticFragmentCall1()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v= inflater.inflate(R.layout.fragment_static_fragment_call1, container, false)
        init(container)
        return v
    }

    lateinit var backPressLis:backPressInterface
    override fun onAttach(context: Context) {
        super.onAttach(context)
        backPressLis=
            try
                {
                    activity as backPressInterface
                }
                catch(e:java.lang.ClassCastException) {
                    throw ClassCastException("class must implement cast method")
                }
            }


    fun init(v2:ViewGroup?) {
        val b1:Button=v.findViewById(R.id.send)
        val b2:Button=v.findViewById(R.id.clear)
        Toast.makeText( context,"hellooooo", Toast.LENGTH_SHORT).show()
        b1.setOnClickListener {
            backPressLis.backPressClick("Button has been clicked")
        }
        b2.setOnClickListener {
            backPressLis.backPressClick("")
        }
    }

}