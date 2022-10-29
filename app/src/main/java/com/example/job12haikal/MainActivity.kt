package com.example.job12haikal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnProfile = findViewById<Button>(R.id.buttonProfile)
        val btnSmk = findViewById<Button>(R.id.buttonSmk)

        btnProfile.setOnClickListener {
            val intent = Intent(this, profilnama::class.java)
            startActivity(intent)
        }

        btnSmk.setOnClickListener {
            val intent = Intent (this, profilsmk::class.java)
            startActivity(intent)
        }
    }
}