package com.example.androidaixnice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NewActivity : AppCompatActivity() {
    val TAG = "NEW ACTIVITY"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        var action = intent.action
        val isUserView = intent.hasCategory("user")
        val extras : Bundle? = intent.extras
        val name = extras?.getString("name")
        val age = extras?.getInt("age")
        Log.i(TAG, "action: $action, isUserViewer: $isUserView, name: $name, age: $age")

    }
}