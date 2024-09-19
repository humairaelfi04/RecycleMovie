package com.humaira.loginpage

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.humaira.loginpage.adapter.BukuAdapter
import com.humaira.loginpage.model.ModelBuku


private lateinit var rev_data : RecyclerView
class RecycleViewActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)
        rev_data = findViewById(R.id.rv_data)

        //kita bikin array list
        val listBuku = listOf(
            ModelBuku(judul = "Buku Android 1 2024", penulis = "Rizki Syahputra"),
            ModelBuku(judul = "Buku Android 2 2024", penulis = "Rizki Syahputra"),
            ModelBuku(judul = "Buku Android 3 2024", penulis = "Rizki Syahputra"),
            ModelBuku(judul = "Buku Android 4 2024", penulis = "Rizki Syahputra"),
            ModelBuku(judul = "Buku Android 5 2024", penulis = "Rizki Syahputra"),
            ModelBuku(judul = "Buku Android 6 2024", penulis = "Rizki Syahputra"),
            ModelBuku(judul = "Buku Android 7 2024", penulis = "Rizki Syahputra"),
        )

        //baru kita set adapter
        val nBukuAdapter = BukuAdapter(listBuku)
        rev_data.apply {
            layoutManager = LinearLayoutManager(this@RecycleViewActivity)
            adapter = nBukuAdapter
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnRecycleMovie)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}