package com.example.fastmart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.fastmart.databinding.FragmentCategoriesBinding
import com.example.fastmart.databinding.FragmentHomeBinding

class categoriesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: FragmentCategoriesBinding = DataBindingUtil.inflate(

            inflater, R.layout.fragment_categories, container, false
        )
        binding.productView.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_categoriesFragment_to_productFragment)
        )


        return binding.root
    }
}