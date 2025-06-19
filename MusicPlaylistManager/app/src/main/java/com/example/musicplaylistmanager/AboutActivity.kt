package com.example.musicplaylistmanager

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Logging best practices reference:
//  Android Developers - Logging
//  https://developer.android.com/reference/android/util/Log

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        Log.d("AboutActivity", "Activity created")

        val btnBack = findViewById<Button>(R.id.btnBackFromAbout)
        btnBack.setOnClickListener {
            finish()
            Log.d("AboutActivity", "Returning to MainActivity")
        }
    }
}