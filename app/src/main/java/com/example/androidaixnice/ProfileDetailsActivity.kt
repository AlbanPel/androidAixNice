package com.example.androidaixnice

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class ProfileDetailsActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_details)
        Log.i("ProfileDetaislActivity", "OK")
        val profile: Profile? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            Log.i("Probleme", "je suis dans me Tiramisu")
           intent.getParcelableExtra("profile", Profile::class.java)
        }
        else {
            Log.i("Mon probleme", "Je suis depreciate")
              intent.getParcelableExtra("profile")
        }

        val nameTextView = findViewById<TextView>(R.id.name)
        val ageTextView = findViewById<TextView>(R.id.age)

        nameTextView.setText("NOM : ${profile?.name}")
        ageTextView.setText("AGE : ${profile?.age}")

    }

}