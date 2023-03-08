package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentB : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_b, container, false)

//        TODO
        val view =  inflater.inflate(R.layout.fragment_b, container, false)
        view.findViewById<Button>(R.id.button_b).setOnClickListener {
            val fragmentA = FragmentA()
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragmentA)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}