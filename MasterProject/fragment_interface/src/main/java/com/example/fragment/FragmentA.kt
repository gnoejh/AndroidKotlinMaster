package com.example.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentA : Fragment() {
    private var myInterface: MyInterface? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        myInterface = context as? MyInterface
        if (myInterface == null) {
            throw ClassCastException("$context must implement MyInterface")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        view.findViewById<Button>(R.id.button_a).setOnClickListener {
            myInterface?.onButtonClicked()
        }

        return view
    }
}
