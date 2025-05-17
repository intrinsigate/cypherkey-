package com.elevate.app.ui.membership

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elevate.app.databinding.FragmentMembershipComparisonBinding

class MembershipComparisonFragment : Fragment() {

    private var _binding: FragmentMembershipComparisonBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMembershipComparisonBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupComparisonTable()
        setupClickListeners()
    }
    
    private fun setupComparisonTable() {
        // In a real app, this would populate the comparison table
        // with data from a repository
    }
    
    private fun setupClickListeners() {
        binding.buttonBack.setOnClickListener {
            // Navigate back
            requireActivity().onBackPressed()
        }
        
        binding.buttonUpgradeNow.setOnClickListener {
            // Navigate to membership upgrade screen
            // In a real app, this would use the Navigation component
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
