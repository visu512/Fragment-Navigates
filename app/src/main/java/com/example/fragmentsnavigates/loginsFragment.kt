package com.example.fragmentsnavigates

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class loginsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_logins, container, false)
        val login  = view.findViewById<TextView>(R.id.login)

        login.setOnClickListener{
            findNavController().navigate(R.id.action_loginsFragment_to_mainsFragment)
        }
        return view

    }
}