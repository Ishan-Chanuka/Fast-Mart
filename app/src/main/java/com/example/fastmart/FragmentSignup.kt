package com.example.fastmart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.fastmart.databinding.FragmentLoginBinding
import com.example.fastmart.databinding.FragmentSignupBinding

class FragmentSignup : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ):  View {
        // Inflate the layout for this fragment
        val binding: FragmentSignupBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_signup, container, false
        )
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
        binding.toLogin.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_fragmentSignup_to_loginFragment2)
        )
        return binding.root
    }
}