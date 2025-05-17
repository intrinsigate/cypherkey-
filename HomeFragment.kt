package com.elevate.app.ui.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elevate.app.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupUI()
        loadRecommendations()
        loadProgressItems()
        loadTrendingItems()
    }
    
    private fun setupUI() {
        // Set welcome message with user name
        binding.textWelcome.text = getString(com.elevate.app.R.string.welcome_back, "Alex")
    }
    
    private fun loadRecommendations() {
        // In a real app, this would load data from a repository
        // For now, we'll just set up the UI with mock data
    }
    
    private fun loadProgressItems() {
        // In a real app, this would load data from a repository
        // For now, we'll just set up the UI with mock data
    }
    
    private fun loadTrendingItems() {
        // In a real app, this would load data from a repository
        // For now, we'll just set up the UI with mock data
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
