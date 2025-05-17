package com.elevate.app.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.elevate.app.R
import com.elevate.app.ui.onboarding.OnboardingActivity

class SplashActivity : AppCompatActivity() {
    
    private val SPLASH_DISPLAY_LENGTH = 2000L // 2 seconds
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        
        // Use a handler to delay loading the next activity
        Handler(Looper.getMainLooper()).postDelayed({
            // Start the onboarding activity
            val intent = Intent(this, OnboardingActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DISPLAY_LENGTH)
    }
}
