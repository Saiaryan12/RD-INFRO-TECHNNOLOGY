package com.aryan.rdinfroapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class IntroAdapter(
    private val titles: List<String>,
    private val descriptions: List<String>
) : RecyclerView.Adapter<IntroAdapter.IntroViewHolder>() {

    class IntroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.txtTitle)
        val desc: TextView = view.findViewById(R.id.txtDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_intro, parent, false)
        return IntroViewHolder(view)
    }

    override fun onBindViewHolder(holder: IntroViewHolder, position: Int) {
        holder.title.text = titles[position]
        holder.desc.text = descriptions[position]
    }

    override fun getItemCount(): Int {
        return titles.size
    }
}