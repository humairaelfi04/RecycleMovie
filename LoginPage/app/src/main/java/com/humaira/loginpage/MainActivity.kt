package com.humaira.loginpage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var eUser : EditText
    private lateinit var ePassword : EditText
    private lateinit var  btnLogin : Button
    private lateinit var btnListView : Button
    private lateinit var btnRecycleBuah : Button
    private lateinit var btnRecycleView : Button
    private lateinit var btnRecycleMovie : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        eUser = findViewById(R.id.eUser)
        ePassword = findViewById(R.id.ePassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnListView = findViewById(R.id.btnListView)
        btnRecycleBuah = findViewById(R.id.btnRecycleBuah2)
        btnRecycleView = findViewById(R.id.btnRecycleView)
        btnRecycleMovie = findViewById(R.id.btnRecycleMovie)

        btnLogin.setOnClickListener(){

            val nUsername = eUser.text.toString()
            val nPassword = ePassword.text.toString()

            val intentPassingData = Intent(this@MainActivity,
                WelcomePageActivity::class.java)

            intentPassingData.putExtra("username", nUsername)
            intentPassingData.putExtra("password", nPassword)

            Log.d("cek data username", nUsername)
            Log.d("cek data password", nPassword)

            startActivity(intentPassingData)
        }

        btnListView.setOnClickListener{
            val intent = Intent(this@MainActivity, ListView::class.java)
            startActivity(intent)
        }

        btnRecycleBuah.setOnClickListener{
            val intent = Intent(this@MainActivity, RecycleBuahImageActivity::class.java)
            startActivity(intent)
        }

        btnRecycleView.setOnClickListener{
            val intent = Intent(this@MainActivity, RecycleViewActivity::class.java)
            startActivity(intent)
        }

        btnRecycleMovie.setOnClickListener{
            val intent = Intent(this@MainActivity, MovieActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}