package com.aryan.rdinfroapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import android.content.Intent
import android.widget.Button
class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val btnProfile = findViewById<Button>(R.id.btnProfile)

        btnProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val posts = listOf(
            Post(1, 1, "Android Development", "Learn Android using Kotlin"),
            Post(1, 2, "Firebase Authentication", "Implement login system using Firebase"),
            Post(1, 3, "RecyclerView", "Display dynamic lists in Android"),
            Post(1, 4, "Retrofit API", "Fetch online data using Retrofit"),
            Post(1, 5, "Jetpack Compose", "Modern Android UI toolkit")
        )

        recyclerView.adapter = PostAdapter(posts)
    }
}

