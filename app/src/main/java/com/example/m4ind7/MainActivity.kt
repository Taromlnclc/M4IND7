package com.example.m4ind7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = "Hola bienvenido a la APP 7 del modulo 4!"
        val duration = Toast.LENGTH_SHORT
        Toast.makeText(this, text, duration).show()
    }
}