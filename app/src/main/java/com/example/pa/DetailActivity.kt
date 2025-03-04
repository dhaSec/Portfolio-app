package com.example.pa

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra("TITLE") ?: "No Title"
        val details = intent.getStringExtra("DETAILS") ?: "No Details Available"

        findViewById<TextView>(R.id.txtTitle).text = title
        findViewById<TextView>(R.id.txtDetails).text = details
    }
}
