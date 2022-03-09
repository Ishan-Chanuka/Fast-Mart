package com.example.fastmart

import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.fastmart.databinding.FragmentLoginBinding
import com.example.fastmart.databinding.FragmentQRBinding
import java.util.jar.Manifest

class QRFragment : Fragment() {

    private lateinit var codescanner: QRFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        if (ContextCompat.checkSelfPermission( context: this, Manifest.Permission.CAMERA) ==
//        PackageManager.PERMISSION_DENIED){
//            ActivityCompat.requestPermissions(activity: this, arrayof(Manifest.permission.CAMERA))
//        }

        
        // Inflate the layout for this fragment
        val binding: FragmentQRBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_q_r, container, false
        )
//        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()


        return binding.root
    }
}