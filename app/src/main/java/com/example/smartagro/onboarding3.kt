package com.example.smartagro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding3)

        val btnNavigate: Button = findViewById(R.id.next_button4)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, LogOrSingup::class.java)
            startActivity(intent)
        }


    }
}