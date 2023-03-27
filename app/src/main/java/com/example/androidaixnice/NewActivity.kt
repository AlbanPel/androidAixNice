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
        Log.i(TAG, "action: $action")
        Log.v(TAG, "Verbose message")
        Log.d(TAG, "Debug message")
        Log.i(TAG, "Info message")
        Log.w(TAG, "Warning message")
        Log.e(TAG, "Error message")
    }
}