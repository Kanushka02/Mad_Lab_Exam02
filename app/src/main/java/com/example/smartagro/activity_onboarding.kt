package com.example.smartagro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding)

        val btnNavigate: Button = findViewById(R.id.next_button2)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, onboarding2::class.java)
            startActivity(intent)
        }


    }
}