package com.aryan.rdinfroapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(private val newsList: List<News>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title = itemView.findViewById<TextView>(R.id.txtTitle)
        val description = itemView.findViewById<TextView>(R.id.txtDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false)

        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {

        holder.title.text = newsList[position].title
        holder.description.text = newsList[position].description
    }

    override fun getItemCount(): Int {
        return newsList.size
    }
}