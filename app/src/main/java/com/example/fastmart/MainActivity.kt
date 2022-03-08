package com.example.fastmart

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val home =Fragment_home()
        val fm:FragmentManager= supportFragmentManager
        fm.beginTransaction().add(R.id.profile,home).commit()



    }
}