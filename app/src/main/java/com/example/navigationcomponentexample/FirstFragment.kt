package com.example.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_first, container, false)


        val tvOne = view.findViewById<TextView>(R.id.tv_one)

        tvOne.setOnClickListener(){

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(45)

            Navigation.findNavController(view).navigate(action)

        }


        return view
    }

}