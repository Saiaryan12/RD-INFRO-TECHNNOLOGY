package com.aryan.rdinfroapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({

            val sharedPref = getSharedPreferences("intro", MODE_PRIVATE)
            val isIntroDone = sharedPref.getBoolean("isIntroDone", false)

            if (isIntroDone) {
                startActivity(Intent(this, HomeActivity::class.java))
            } else {
                startActivity(Intent(this, IntroActivity::class.java))
            }

            finish()

        }, 2000)
    }
}