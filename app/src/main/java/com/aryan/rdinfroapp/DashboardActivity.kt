package com.aryan.rdinfroapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val newsList = listOf(
            News("Android 15 Released", "Google officially released Android 15."),
            News("Firebase Authentication", "Learn Firebase login system in Android."),
            News("Jetpack Compose", "Modern UI toolkit for Android development."),
            News("Kotlin for Android", "Kotlin is now the preferred Android language."),
            News("RecyclerView", "RecyclerView efficiently displays large data sets.")
        )

        recyclerView.adapter = NewsAdapter(newsList)
    }
}