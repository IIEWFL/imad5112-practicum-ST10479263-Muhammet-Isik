package com.example.musicplaylistmanager

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
// StringBuilder optimization reference:
//  Kotlinlang Documentation - String Templates
//  https://kotlinlang.org/docs/strings.html#string-templates
//
//Collection operations reference:
//  Kotlin Collections Guide
//  https://kotlinlang.org/docs/collections-overview.html


class PlaylistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist)

        val songList = intent.getStringArrayListExtra("songs") ?: arrayListOf()
        val artistList = intent.getStringArrayListExtra("artists") ?: arrayListOf()
        val ratingList = intent.getIntegerArrayListExtra("ratings") ?: arrayListOf()
        val commentList = intent.getStringArrayListExtra("comments") ?: arrayListOf()

        val outputText = findViewById<TextView>(R.id.text_playlist_output)
        val showSongsButton = findViewById<Button>(R.id.button_display_songs)
        val avgButton = findViewById<Button>(R.id.button_average_rating)
        val backButton = findViewById<Button>(R.id.button_back)

        showSongsButton.setOnClickListener {
            if (songList.isEmpty()) {
                outputText.text = "No songs available."
            } else {
                val builder = StringBuilder()
                for (i in songList.indices) {
                    builder.append("Song: ${songList[i]}\n")
                    builder.append("Artist: ${artistList[i]}\n")
                    builder.append("Rating: ${ratingList[i]}/5\n")
                    builder.append("Comments: ${commentList[i]}\n\n")
                }
                outputText.text = builder.toString()
            }
        }

        avgButton.setOnClickListener {
            if (ratingList.isNotEmpty()) {
                val avg = ratingList.average()
                outputText.text = "Average Rating: %.1f/5".format(avg)
            } else {
                outputText.text = "No ratings to calculate."
            }
        }

        backButton.setOnClickListener {
            finish()
        }
    }
}
