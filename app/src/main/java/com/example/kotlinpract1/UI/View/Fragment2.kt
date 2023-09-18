package com.example.kotlinpract1.UI.View

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kotlinpract1.R

class Fragment2 : Fragment() {
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment2, container, false)
        val buttonToFragment1 = view.findViewById<Button>(R.id.button_back_fragment2)
        // init

        buttonToFragment1.setOnClickListener {
//            val fragmentTransaction = parentFragmentManager.beginTransaction()
//            fragmentTransaction.replace(R.id.fragment_container, Fragment1())
//            fragmentTransaction.addToBackStack(null)
//            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
//            fragmentTransaction.commit()
            findNavController().navigate(R.id.action_fragment2_to_fragment1)
            // System.exit(-1)
        }

        return view
    }
}
