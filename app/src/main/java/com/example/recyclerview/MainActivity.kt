package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter

    private val data = listOf(WeatherItem("29 янв", "Сегодня", "Snowy", -17, -30),
        WeatherItem("30 янв", "Завтра", "Cloudy", -17, -30),
        WeatherItem("31 янв", "Пт", "Snowy", -18, -32),
        WeatherItem("1 фев", "Сб", "Cloudy", -15, -26),
        WeatherItem("2 фев", "Вс", "Cloudy", -14, -24),
        WeatherItem("3 фев", "Пн", "Snowy", -20, -36),)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MyAdapter(data)
        recyclerView.adapter = adapter

    }

}