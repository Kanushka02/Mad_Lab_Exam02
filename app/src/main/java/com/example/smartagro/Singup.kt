package com.example.smartagro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Singup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_singup)

        val btnReg: Button = findViewById(R.id.reg)
        btnReg.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val btnlog: Button = findViewById(R.id.log)
        btnlog.setOnClickListener {
            val intent = Intent(this, log::class.java)
            startActivity(intent)
        }
    }
}