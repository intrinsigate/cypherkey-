package com.elevate.app.ui.membership

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elevate.app.R
import com.elevate.app.databinding.FragmentMembershipUpgradeBinding

class MembershipUpgradeFragment : Fragment() {

    private var _binding: FragmentMembershipUpgradeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMembershipUpgradeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupMembershipTiers()
        setupClickListeners()
    }
    
    private fun setupMembershipTiers() {
        // In a real app, this would load data from a repository
        // For now, we'll just set up the UI with the predefined tiers
    }
    
    private fun setupClickListeners() {
        binding.buttonSelectPlus.setOnClickListener {
            // Handle Plus tier selection
            proceedToPayment(R.string.elevate_plus, 9.99f)
        }
        
        binding.buttonSelectPro.setOnClickListener {
            // Handle Pro tier selection
            proceedToPayment(R.string.elevate_pro, 19.99f)
        }
        
        binding.buttonSelectElite.setOnClickListener {
            // Handle Elite tier selection
            proceedToPayment(R.string.elevate_elite, 29.99f)
        }
        
        binding.buttonBack.setOnClickListener {
            // Navigate back
            requireActivity().onBackPressed()
        }
    }
    
    private fun proceedToPayment(tierNameResId: Int, price: Float) {
        // In a real app, this would navigate to the payment screen
        // with the selected tier information
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
