package com.example.smartagro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LogOrSingup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log_or_singup)

        val btnLogin: Button = findViewById(R.id.login)
        btnLogin.setOnClickListener {
            val intent = Intent(this, log::class.java)
            startActivity(intent)
        }
        val btnSignup: Button = findViewById(R.id.signup)
        btnSignup.setOnClickListener {
            val intent = Intent(this, Singup::class.java)
            startActivity(intent)
        }
    }
}