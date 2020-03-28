package com.example.covid_19_tn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        val rg =view.findViewById<RadioGroup>(R.id.rg)
        rg.setOnCheckedChangeListener{ group: RadioGroup?, checkedId: Int ->
            when(checkedId) {
                R.id.rb1 -> Toast.makeText(view.context,"passez à la question suivante", Toast.LENGTH_SHORT ).show()



                R.id.rb2 -> Toast.makeText(view.context, "passez à la question suivante", Toast.LENGTH_SHORT).show()

            }
        }


    }
}
