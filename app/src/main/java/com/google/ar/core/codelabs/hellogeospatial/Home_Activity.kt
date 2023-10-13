package com.google.ar.core.codelabs.hellogeospatial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.map_activity.*

class Home_Activity : AppCompatActivity() {

    private lateinit var camera_intent : Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val community = "com.sohee.community"
        val intentCommunity=packageManager.getLaunchIntentForPackage(community)

        camera_intent = Intent(this, MainActivity::class.java)

        camera_button.setOnClickListener{
            startActivity(camera_intent)
        }

        community_button.setOnClickListener{
            startActivity(intentCommunity)
        }
    }
}