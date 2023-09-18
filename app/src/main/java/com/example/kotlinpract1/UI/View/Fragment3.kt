package com.example.kotlinpract1.UI.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListAdapter
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinpract1.R
import com.example.kotlinpract1.UI.StateHolder.ViewModel.ItemVM
import com.example.kotlinpract1.databinding.Fragment3Binding

class Fragment3 : Fragment() {
    private lateinit var binding: Fragment3Binding
    private lateinit var mItemVM: ItemVM;

    override fun onResume() {
        super.onResume()
        val adapter = RecycleAdapter()
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        mItemVM.getAllData.observe(viewLifecycleOwner) { item ->
            adapter.setData(item)
        }

        binding.recyclerView.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment3Binding.inflate(inflater, container, false)
        mItemVM = ViewModelProvider(this).get(ItemVM::class.java)
        val view = binding.root

        val buttonToFragment1 = view.findViewById<Button>(R.id.button_back_fragment3)

        buttonToFragment1.setOnClickListener {
            findNavController().navigate(R.id.action_fragment3_to_fragment1)
        }

        return view
    }
}

