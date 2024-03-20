package com.example.mystream

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgView1 = findViewById<ImageView>(R.id.imageView1)
        val imgView2 = findViewById<ImageView>(R.id.imageView2)
        val imgView3 = findViewById<ImageView>(R.id.imageView3)
        val imgView4 = findViewById<ImageView>(R.id.imageView4)
        val imgView5 = findViewById<ImageView>(R.id.imageView5)
        val imgView6 = findViewById<ImageView>(R.id.imageView6)
        val imgView7 = findViewById<ImageView>(R.id.imageView7)
        val imgView8 = findViewById<ImageView>(R.id.imageView8)
        val imgView9 = findViewById<ImageView>(R.id.imageView9)
        val imgView10 = findViewById<ImageView>(R.id.imageView10)
        val imgView11 = findViewById<ImageView>(R.id.imageView11)
        val imgView12 = findViewById<ImageView>(R.id.imageView12)
        val imgView13 = findViewById<ImageView>(R.id.imageView13)
        val imgView14 = findViewById<ImageView>(R.id.imageView14)
        val imgView15 = findViewById<ImageView>(R.id.imageView15)

        imgView1.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                val titulo="Madame Teia"
                val classe="Filme"
                val sinopse="Depois de sobreviver a um terrível acidente, a paramédica Cassandra Webb começa a desenvolver habilidades de clarividência. Forçada a enfrentar revelações sobre seu passado, ela estabelece um relacionamento com três jovens destinadas a futuros poderosos... se todas conseguirem sobreviver a um presente mortal.\n" +
                        "\n" +
                        "S.J. Clarkson"
                putExtra("image", R.drawable.img)
                putExtra("titulo",titulo)
                putExtra("classe",classe)
                putExtra("sinopse",sinopse)
            }
            Toast.makeText(this," clicou imagem 1",LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView2.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                val titulo="Bob Marley One Love"
                val classe="Filme"
                val sinopse="O jamaicano Bob Marley supera as adversidades para se tornar um dos o músicos mais famosos do mundo."
                putExtra("image", R.drawable.img_1)
                putExtra("titulo",titulo)
                putExtra("classe",classe)
                putExtra("sinopse",sinopse)

            }
            Toast.makeText(this," clicou imagem 2",LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView3.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                putExtra("image", R.drawable.img_2)

            }
            Toast.makeText(this," clicou imagem 3",LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView4.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                putExtra("image", R.drawable.img_3)

            }
            Toast.makeText(this," clicou imagem 4",LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView5.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                putExtra("image", R.drawable.img_4)

            }
            Toast.makeText(this," clicou imagem 5",LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView6.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                putExtra("image", R.drawable.img_5)

            }
            Toast.makeText(this," clicou imagem 6",LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView7.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                putExtra("image", R.drawable.img_6)

            }
            Toast.makeText(this," clicou imagem 7",LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView8.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                putExtra("image", R.drawable.img_7)

            }
            Toast.makeText(this," clicou imagem 8",LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView9.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                putExtra("image", R.drawable.img_8)

            }
            Toast.makeText(this," clicou imagem 9",LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView10.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                putExtra("image", R.drawable.img_9)

            }
            Toast.makeText(this," clicou imagem 10",LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView11.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                putExtra("image", R.drawable.img_10)

            }
            Toast.makeText(this," clicou imagem 11",LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView12.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                putExtra("image", R.drawable.img_11)

            }
            Toast.makeText(this," clicou imagem 12",LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView13.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                putExtra("image", R.drawable.img_12)

            }
            Toast.makeText(this," clicou imagem 13",LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView14.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                putExtra("image", R.drawable.img_13)

            }
            Toast.makeText(this," clicou imagem 14",LENGTH_SHORT).show()
            startActivity(intent)
        }
        imgView15.setOnClickListener {
            val intent: Intent = Intent(this,MovieDetailActivity::class.java).apply {
                putExtra("image", R.drawable.img_14)

            }
            Toast.makeText(this," clicou imagem 15",LENGTH_SHORT).show()
            startActivity(intent)
        }




    }
}