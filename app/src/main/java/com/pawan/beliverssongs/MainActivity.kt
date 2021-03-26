package com.pawan.beliverssongs

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var img1: ImageView? = null
    var top: Animation? = null
    //val int: SPLASH_TIMEOUT? = 4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //user
        //data from new branch
        //pull req
    }

    override fun onResume() {
        super.onResume()
        val img1 = findViewById<View>(R.id.logo) as ImageView
        top = AnimationUtils.loadAnimation(applicationContext, R.anim.mainlogoanimation)
        img1.animation = top

        img1.postDelayed({
            startActivity(Intent(applicationContext, SongTypes::class.java))
            finish()
        },4000)
    }
}
