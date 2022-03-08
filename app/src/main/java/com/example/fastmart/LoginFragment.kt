package com.example.fastmart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fastmart.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false
        )
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
        binding.toSignup.setOnClickListener (
                Navigation.createNavigateOnClickListener(R.id.action_loginFragment2_to_fragmentSignup)
        )
        binding.loginButton.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_loginFragment2_to_fragment_home)
        )
        return binding.root
    }
}