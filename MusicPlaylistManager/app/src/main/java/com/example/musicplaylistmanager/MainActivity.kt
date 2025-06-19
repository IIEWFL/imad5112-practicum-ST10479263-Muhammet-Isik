package com.example.musicplaylistmanager

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val songTitles = arrayListOf<String>()
    private val artistNames = arrayListOf<String>()
    private val ratings = arrayListOf<Int>()
    private val comments = arrayListOf<String>()

    // ... existing code ...
//  Intent data passing reference:
    //  IMAD Module Manual - Page 137
    //  https://advtechonline.sharepoint.com/.../IMAD5112_MM.docx

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_add_song).setOnClickListener { showAddSongDialog() }
        findViewById<Button>(R.id.button_view_playlist).setOnClickListener { openPlaylistActivity() }
        findViewById<Button>(R.id.button_about).setOnClickListener { openAboutPage() }
        findViewById<Button>(R.id.button_exit).setOnClickListener { finish() }
    }

    // Dialog implementation reference:
    // Android Developers Documentation - AlertDialog
    //  https://developer.android.com/guide/topics/ui/dialogs
    //
    private fun showAddSongDialog() {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_add_song, null)

        AlertDialog.Builder(this)
            .setTitle("Add New Song")
            .setView(dialogView)
            .setPositiveButton("Add") { _, _ ->
                val title = dialogView.findViewById<EditText>(R.id.input_song_title).text.toString()
                val artist = dialogView.findViewById<EditText>(R.id.input_artist_name).text.toString()
                val ratingStr = dialogView.findViewById<EditText>(R.id.input_rating).text.toString()
                val comment = dialogView.findViewById<EditText>(R.id.input_comments).text.toString()

                if (title.isEmpty() || artist.isEmpty() || ratingStr.isEmpty()) {
                    Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
                    return@setPositiveButton
                }

                val rating = ratingStr.toIntOrNull()
                if (rating == null || rating !in 1..5) {
                    Toast.makeText(this, "Rating must be between 1 and 5", Toast.LENGTH_SHORT).show()
                    return@setPositiveButton
                }

                songTitles.add(title)
                artistNames.add(artist)
                ratings.add(rating)
                comments.add(comment)

                Toast.makeText(this, "Song added!", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun openPlaylistActivity() {
        val intent = Intent(this, PlaylistActivity::class.java)
        intent.putStringArrayListExtra("songs", songTitles)
        intent.putStringArrayListExtra("artists", artistNames)
        intent.putIntegerArrayListExtra("ratings", ArrayList(ratings))
        intent.putStringArrayListExtra("comments", comments)
        startActivity(intent)
    }

    private fun openAboutPage() {
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }
}
