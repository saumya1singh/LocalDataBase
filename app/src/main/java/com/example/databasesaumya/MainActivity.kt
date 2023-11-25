package com.example.databasesaumya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var editTextName: EditText
    lateinit var editTextPassword: EditText
    lateinit var buttonSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        editTextName= findViewById(R.id.eTName)
        editTextPassword= findViewById(R.id.etPassword)
        buttonSave= findViewById(R.id.btnSave)

        buttonSave.setOnClickListener {

            val sharedPref= getSharedPreferences("Login Data", MODE_PRIVATE)
            val editor= sharedPref.edit()
            val n= editTextName.text.toString()
            val p= editTextPassword.text.toString()
            editor.putString("Name", n)
            editor.putString("Password", p)
            editor.apply()
            Toast.makeText(this, "Data Saved Successfully", Toast.LENGTH_SHORT).show()

            val i= Intent(this, HomeScreen::class.java)
            startActivity(i)
        }

    }
}