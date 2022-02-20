package com.example.fragmentdemo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val btnAbout : Button = view.findViewById(R.id.btn_about)

        btnAbout.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_aboutFragment)
        }

        return view
    }
}