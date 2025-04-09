package com.example.smartagro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)




        val btnFav: ImageView = findViewById(R.id.fav)

        btnFav.setOnClickListener {
            val intent = Intent(this, fav::class.java)
            startActivity(intent)
        }

        val btnCartM: ImageView = findViewById(R.id.cart)

        btnCartM.setOnClickListener {
            val intent = Intent(this, cart::class.java)
            startActivity(intent)
        }

        val btnProfile: ImageView = findViewById(R.id.profile)

        btnProfile.setOnClickListener {
            val intent = Intent(this, setting::class.java)
            startActivity(intent)
        }

        val btnNavigate: ImageView = findViewById(R.id.imageView5)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }


    }
}