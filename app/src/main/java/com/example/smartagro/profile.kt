package com.example.smartagro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val btnB1: ImageButton = findViewById(R.id.back4)

        btnB1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val btnCart1 : ImageButton = findViewById(R.id.fav1)

        btnCart1.setOnClickListener {
            val intent = Intent(this, fav::class.java)
            startActivity(intent)
        }

        val btnB2: Button = findViewById(R.id.AddC1)

        btnB2.setOnClickListener {
            val intent = Intent(this, cart::class.java)
            startActivity(intent)
        }
    }
}