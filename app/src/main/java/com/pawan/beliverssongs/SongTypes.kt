package com.pawan.beliverssongs

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SongTypes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song_types)

    }

    fun marthi(view: View) {
        startActivity(Intent(this, songShowMarthi::class.java))


    }

    fun hindi(view: View) {
        startActivity(Intent(this, SongShowHindi::class.java))

    }
    fun english(view: View) {
        startActivity(Intent(this,SongShowEnglish::class.java))
    }
}