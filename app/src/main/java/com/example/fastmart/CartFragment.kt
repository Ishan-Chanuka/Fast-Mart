package com.example.fastmart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.fastmart.databinding.FragmentCartBinding
import com.example.fastmart.databinding.FragmentHomeBinding


class CartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: FragmentCartBinding = DataBindingUtil.inflate(

            inflater, R.layout.fragment_cart, container,false
        )

        return binding.root
    }


}