package com.example.mysidebarwork.ui.fishinglocation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mysidebarwork.databinding.FragmentFishingLocationBinding

class FishingLocationFragment : Fragment() {

    private var _binding: FragmentFishingLocationBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fishinglocationViewModel =
            ViewModelProvider(this).get(FishingLocationViewModel::class.java)

        _binding = FragmentFishingLocationBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textFishingLocation
        fishinglocationViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}