package com.elevate.app.ui.onboarding

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.elevate.app.R
import com.elevate.app.databinding.ActivityOnboardingBinding
import com.elevate.app.ui.auth.AuthActivity

class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardingBinding
    private lateinit var adapter: OnboardingAdapter
    private lateinit var indicators: Array<ImageView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupOnboardingItems()
        setupIndicators()
        setCurrentIndicator(0)
        setupButtons()
    }

    private fun setupOnboardingItems() {
        adapter = OnboardingAdapter(
            listOf(
                OnboardingItem(
                    title = getString(R.string.onboarding_title_1),
                    description = getString(R.string.onboarding_desc_1),
                    imageResId = R.drawable.onboarding_1
                ),
                OnboardingItem(
                    title = getString(R.string.onboarding_title_2),
                    description = getString(R.string.onboarding_desc_2),
                    imageResId = R.drawable.onboarding_2
                ),
                OnboardingItem(
                    title = getString(R.string.onboarding_title_3),
                    description = getString(R.string.onboarding_desc_3),
                    imageResId = R.drawable.onboarding_3
                )
            )
        )

        binding.viewPagerOnboarding.adapter = adapter

        binding.viewPagerOnboarding.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
                updateButtonsForPosition(position)
            }
        })
    }

    private fun setupIndicators() {
        indicators = Array(adapter.itemCount) { ImageView(applicationContext) }
        val layoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        layoutParams.setMargins(8, 0, 8, 0)
        
        for (i in indicators.indices) {
            indicators[i].apply {
                this.layoutParams = layoutParams
                setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive
                    )
                )
                binding.indicatorsContainer.addView(this)
            }
        }
    }

    private fun setCurrentIndicator(position: Int) {
        for (i in indicators.indices) {
            indicators[i].setImageDrawable(
                ContextCompat.getDrawable(
                    applicationContext,
                    if (i == position) R.drawable.indicator_active else R.drawable.indicator_inactive
                )
            )
        }
    }

    private fun updateButtonsForPosition(position: Int) {
        when (position) {
            adapter.itemCount - 1 -> {
                binding.buttonNext.text = getString(R.string.get_started)
                binding.buttonSkip.visibility = android.view.View.GONE
            }
            else -> {
                binding.buttonNext.text = getString(R.string.next)
                binding.buttonSkip.visibility = android.view.View.VISIBLE
            }
        }
    }

    private fun setupButtons() {
        binding.buttonSkip.setOnClickListener {
            navigateToAuthActivity()
        }

        binding.buttonNext.setOnClickListener {
            val currentPosition = binding.viewPagerOnboarding.currentItem
            if (currentPosition < adapter.itemCount - 1) {
                binding.viewPagerOnboarding.currentItem = currentPosition + 1
            } else {
                navigateToAuthActivity()
            }
        }
    }

    private fun navigateToAuthActivity() {
        startActivity(Intent(this, AuthActivity::class.java))
        finish()
    }
}
