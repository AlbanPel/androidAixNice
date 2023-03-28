package com.example.androidaixnice

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // catch button
        val button = findViewById<Button>(R.id.start_new_activity_btn)
        button.setOnClickListener {
            val intent = Intent(this, NewActivity::class.java)
            intent.action = Intent.ACTION_VIEW
            intent.addCategory("user")
            intent.putExtra("name", "Alban")
            intent.putExtra("age", 25)
            startActivity(intent)
        }

        //parcelable button
        val profile = Profile("Alban", 25)
        val btnParcelable = findViewById<Button>(R.id.parcelable_btn)
         btnParcelable.setOnClickListener {
             val intent = Intent(this, ProfileDetailsActivity::class.java)
             intent.putExtra("profile", profile)
             startActivity(intent)
         }

    }
}