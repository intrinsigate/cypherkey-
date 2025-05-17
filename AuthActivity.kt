package com.elevate.app.ui.auth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.elevate.app.R
import com.elevate.app.databinding.ActivityAuthBinding
import com.elevate.app.ui.main.MainActivity
import com.google.android.material.tabs.TabLayoutMediator

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViewPager()
        setupTabLayout()
    }

    private fun setupViewPager() {
        val adapter = AuthPagerAdapter(this)
        binding.viewPagerAuth.adapter = adapter
    }

    private fun setupTabLayout() {
        TabLayoutMediator(binding.tabLayout, binding.viewPagerAuth) { tab, position ->
            tab.text = when (position) {
                0 -> getString(R.string.sign_in)
                1 -> getString(R.string.sign_up)
                else -> null
            }
        }.attach()
    }

    fun navigateToMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
