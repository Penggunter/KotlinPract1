package com.example.kotlinpract1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment1, container, false)

        // Переход к Фрагменту 2 с помощью
        // ручного управление транзакциями фрагментов
        val buttonToFragment2 = view.findViewById<Button>(R.id.button_to_fragment2)

        buttonToFragment2.setOnClickListener {
            val fragmentTransaction = parentFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container,Fragment2())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            fragmentTransaction.commit()
        }

        // Переход к Фрагменту 3 с помощью Navigation API
        val buttonToFragment3 = view.findViewById<Button>(R.id.button_to_fragment3)

        buttonToFragment3.setOnClickListener {
            findNavController().navigate(R.id.action_fragment1_to_fragment3)
        }

        return view
    }
}
