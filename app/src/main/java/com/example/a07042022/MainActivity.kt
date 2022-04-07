package com.example.a07042022

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imv = findViewById<ImageView>(R.id.imageView)
        val nastepne = findViewById<Button>(R.id.nastepne)
        val poprzednie = findViewById<Button>(R.id.poprzednie)

        nastepne.setOnClickListener {

        }
        poprzednie.setOnClickListener {

        }
    }
}