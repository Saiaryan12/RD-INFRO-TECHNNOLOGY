package com.aryan.rdinfroapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        fetchPosts(recyclerView)
    }

    private fun fetchPosts(recyclerView: RecyclerView) {

        RetrofitClient.apiService.getPosts()
            .enqueue(object : Callback<List<Post>> {

                override fun onResponse(
                    call: Call<List<Post>>,
                    response: Response<List<Post>>
                ) {

                    if (response.isSuccessful) {

                        val posts = response.body() ?: emptyList()

                        recyclerView.adapter = PostAdapter(posts)

                    } else {

                        Toast.makeText(
                            this@DashboardActivity,
                            "Failed to load data",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

                override fun onFailure(call: Call<List<Post>>, t: Throwable) {

                    Toast.makeText(
                        this@DashboardActivity,
                        "Error: ${t.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            })
    }
}