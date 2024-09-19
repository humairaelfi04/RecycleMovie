package com.humaira.loginpage

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomePageActivity : AppCompatActivity() {

    private lateinit var  txtWelcome : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_page)
        txtWelcome = findViewById(R.id.txtWelcome)

        val getDataUsername = intent.getStringExtra("username")
        val getDataPassword = intent.getStringExtra("password")

        txtWelcome.setText("Hello ${getDataUsername}!\n Password anda adalah : ${getDataPassword}")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnListview)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}