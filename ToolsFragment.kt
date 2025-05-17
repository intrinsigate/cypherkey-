package com.elevate.app.ui.main.tools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elevate.app.R
import com.elevate.app.databinding.FragmentToolsBinding
import com.google.android.material.tabs.TabLayoutMediator

class ToolsFragment : Fragment() {

    private var _binding: FragmentToolsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentToolsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupTabLayout()
        setupToolsGrid()
    }
    
    private fun setupTabLayout() {
        val tabTitles = listOf(
            getString(R.string.all_tools),
            getString(R.string.productivity_tools),
            getString(R.string.growth_tools),
            getString(R.string.finance_tools)
        )
        
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }
    
    private fun setupToolsGrid() {
        // In a real app, this would load data from a repository
        // For now, we'll just set up the UI with mock data
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
