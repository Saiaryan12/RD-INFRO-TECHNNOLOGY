package com.aryan.rdinfroapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class IntroActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var btnNext: Button

    private val titles = listOf(
        "Welcome",
        "Learn Android",
        "Start Building"
    )

    private val descriptions = listOf(
        "Welcome to RD INFRO TECHNOLOGY Internship",
        "Learn Android App Development Step by Step",
        "Build Real Android Projects with Kotlin"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        viewPager = findViewById(R.id.viewPager)
        btnNext = findViewById(R.id.btnNext)

        val adapter = IntroAdapter(titles, descriptions)
        viewPager.adapter = adapter

        btnNext.setOnClickListener {

            if (viewPager.currentItem < titles.size - 1) {

                viewPager.currentItem += 1

            } else {

                val sharedPref = getSharedPreferences("intro", MODE_PRIVATE)
                sharedPref.edit().putBoolean("isIntroDone", true).apply()

                startActivity(Intent(this, HomeActivity::class.java))
                finish()
            }
        }
    }
}