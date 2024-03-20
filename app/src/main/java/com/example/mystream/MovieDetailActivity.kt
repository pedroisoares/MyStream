package com.example.mystream

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MovieDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        setSupportActionBar(findViewById(R.id.toolbar))

        val image = findViewById<ImageView>(R.id.imgDet)
        val titulo = findViewById<TextView>(R.id.tvTitulo)
        val classe = findViewById<TextView>(R.id.tvClasse)
        val sinopse = findViewById<TextView>(R.id.tvsinopse)

        val ori_img = intent.getIntExtra("image",0)
        val ori_titulo = intent.getStringExtra("titulo")
        val ori_classe = intent.getStringExtra("classe")
        val ori_sinopse = intent.getStringExtra("sinopse")


        image.setImageResource(ori_img)
        titulo.setText(ori_titulo)
        classe.setText(ori_classe)
        sinopse.setText(ori_sinopse)



    }
}