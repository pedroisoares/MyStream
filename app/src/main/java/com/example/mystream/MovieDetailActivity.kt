package com.example.mystream

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MovieDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}