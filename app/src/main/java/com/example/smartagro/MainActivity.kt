package com.example.smartagro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.widget.Button
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNavigate: Button = findViewById(R.id.next_button1)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, activity_onboarding::class.java)
            startActivity(intent)
        }
    }
}