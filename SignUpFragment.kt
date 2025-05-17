package com.elevate.app.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elevate.app.R
import com.elevate.app.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.buttonSignUp.setOnClickListener {
            // In a real app, we would validate inputs and register the user
            // For now, we'll just navigate to the main activity
            (activity as? AuthActivity)?.navigateToMainActivity()
        }
        
        binding.buttonGoogleSignUp.setOnClickListener {
            // Handle Google sign up
        }
        
        binding.buttonFacebookSignUp.setOnClickListener {
            // Handle Facebook sign up
        }
        
        binding.textSignIn.setOnClickListener {
            // Switch to sign in tab
            (activity as? AuthActivity)?.let {
                it.binding.viewPagerAuth.currentItem = 0
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
