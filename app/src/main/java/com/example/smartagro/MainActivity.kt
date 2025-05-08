package com.example.smartagro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNavigate: Button = findViewById(R.id.next_button1)
        btnNavigate.setOnClickListener {
            startActivity(Intent(this, ActivityOnboarding::class.java))
            // Optional: finish() if you don't want to return to MainActivity
            // finish()
        }
    }
}
