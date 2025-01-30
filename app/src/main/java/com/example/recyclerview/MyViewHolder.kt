package com.example.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val dateView: TextView = itemView.findViewById(R.id.date)
    val dayView: TextView = itemView.findViewById(R.id.day)
    val weatherView: ImageView = itemView.findViewById(R.id.weather)
    val dayDegreesView: TextView = itemView.findViewById(R.id.day_degrees)
    val nightView: TextView = itemView.findViewById(R.id.night_degrees)
}