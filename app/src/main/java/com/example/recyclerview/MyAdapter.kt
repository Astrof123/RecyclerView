package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val data: List<WeatherItem>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.weather_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.dateView.text = data[position].date
        holder.dayView.text = data[position].day
        if (data[position].weather == "Snowy") {
            holder.weatherView.setImageResource(R.drawable.snowy)
        }
        else if (data[position].weather == "Cloudy") {
            holder.weatherView.setImageResource(R.drawable.cloudy)
        }

        holder.dayDegreesView.text = data[position].day_degrees.toString() + "°"
        holder.nightView.text = data[position].night_degrees.toString() + "°"
    }

    override fun getItemCount(): Int {
        return data.size
    }
}