package com.example.a6thp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),backPressInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
        override fun backPressClick(msg: String) {
            var obj1 =
                supportFragmentManager.findFragmentById(R.id.fragment2) as StaticFragmentDemoCall2//passing fragment 2 since 1st is already there
            obj1.onFragmentInteraction(msg)
        }


}