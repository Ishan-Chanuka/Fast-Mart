
package com.example.fastmart

import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.Navigation
import com.example.fastmart.databinding.FragmentHomeBinding
import kotlin.concurrent.fixedRateTimer


class Fragment_home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: FragmentHomeBinding = DataBindingUtil.inflate(

            inflater, R.layout.fragment_home, container,false
        )

        binding.profileIcon.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_fragment_home_to_profileFragment)
        )
        binding.shopingCartIcon.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_fragment_home_to_cartFragment)
        )
        binding.image1.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_fragment_home_to_categoriesFragment)
        )

        binding.qrBtn.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_fragment_home_to_QRFragment)
        )


        return binding.root
    }



}