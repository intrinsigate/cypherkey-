package com.elevate.app.ui.main.insights

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elevate.app.R
import com.elevate.app.databinding.FragmentInsightsBinding
import com.google.android.material.tabs.TabLayoutMediator

class InsightsFragment : Fragment() {

    private var _binding: FragmentInsightsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInsightsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupTabLayout()
        setupInsightsList()
    }
    
    private fun setupTabLayout() {
        val tabTitles = listOf(
            getString(R.string.for_you),
            getString(R.string.trending),
            getString(R.string.saved)
        )
        
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }
    
    private fun setupInsightsList() {
        // In a real app, this would load data from a repository
        // For now, we'll just set up the UI with mock data
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
