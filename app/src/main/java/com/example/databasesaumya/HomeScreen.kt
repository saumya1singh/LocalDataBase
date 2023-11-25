package com.example.databasesaumya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeScreen : AppCompatActivity() {
    lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        resultTextView= findViewById(R.id.tvResult)
        supportActionBar?.hide()

        val sharedPref= getSharedPreferences("Login Data", MODE_PRIVATE)
        val name= sharedPref.getString("Name", "")
        val password= sharedPref.getString("Password", "")

        resultTextView.text= "Name : $name \n Password : $password"
    }
}