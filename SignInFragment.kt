package com.elevate.app.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elevate.app.R
import com.elevate.app.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.buttonSignIn.setOnClickListener {
            // In a real app, we would validate inputs and authenticate the user
            // For now, we'll just navigate to the main activity
            (activity as? AuthActivity)?.navigateToMainActivity()
        }
        
        binding.textForgotPassword.setOnClickListener {
            // Handle forgot password
        }
        
        binding.buttonGoogleSignIn.setOnClickListener {
            // Handle Google sign in
        }
        
        binding.buttonFacebookSignIn.setOnClickListener {
            // Handle Facebook sign in
        }
        
        binding.textSignUp.setOnClickListener {
            // Switch to sign up tab
            (activity as? AuthActivity)?.let {
                it.binding.viewPagerAuth.currentItem = 1
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
