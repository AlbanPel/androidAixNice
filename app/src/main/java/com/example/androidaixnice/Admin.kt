package com.example.androidaixnice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Admin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        val database = Database(this)

        if(database.getUsersCount() == 0) {
            Log.i("Admin", "je suis dans le compteur")
            database.createUser(User("Lorenzo", 22, "lorenzo@kotlin.com"))
            database.createUser(User("Tino", 23, "tino@kotlin.com"))
            database.createUser(User("Leo", 21, "leo@kotlin.com"))
            database.createUser(User("Florent", 10547, "florent@kotlin.com"))
            database.createUser(User("Sebastien", 220, "Sebastien@kotlin.com"))
            database.createUser(User("Jeremy", 28, "Jeremy@kotlin.com"))
            database.createUser(User("Jonathan", 2, "jonathan@kotlin.com"))
            database.createUser(User("Thibault", 19, "thibault@kotlin.com"))
            database.createUser(User("Enrick", 18, "jonathan@kotlin.com"))
        }

       val users = database.getAllUsers()
       for(user in users) {
           Log.i("Admin", "User: " + user)
       }

    }
}