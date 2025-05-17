package com.elevate.app.ui.main.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elevate.app.R
import com.elevate.app.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupUserProfile()
        setupMembershipInfo()
        setupSettings()
    }
    
    private fun setupUserProfile() {
        // In a real app, this would load data from a repository
        // For now, we'll just set up the UI with mock data
        binding.textUserName.text = "Alex Johnson"
        binding.textUserEmail.text = "alex.johnson@example.com"
    }
    
    private fun setupMembershipInfo() {
        // In a real app, this would load data from a repository
        // For now, we'll just set up the UI with mock data
        binding.textMembershipTier.text = getString(R.string.elevate_essentials)
        
        binding.buttonUpgrade.setOnClickListener {
            // Navigate to membership upgrade screen
            navigateToMembershipUpgrade()
        }
    }
    
    private fun setupSettings() {
        binding.cardAccountSettings.setOnClickListener {
            // Navigate to account settings
        }
        
        binding.cardNotifications.setOnClickListener {
            // Navigate to notification settings
        }
        
        binding.cardHelp.setOnClickListener {
            // Navigate to help & support
        }
        
        binding.buttonLogout.setOnClickListener {
            // Handle logout
        }
    }
    
    private fun navigateToMembershipUpgrade() {
        // In a real app, this would navigate to the membership upgrade screen
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
