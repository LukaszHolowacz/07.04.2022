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
        var i = 0

        nastepne.setOnClickListener {
            i++
            if(i==1){
                imv.setImageResource(R.drawable.gory)
            }
            else if(i==2){
                imv.setImageResource(R.drawable.jezioro)
            }
            else if(i==3){
                imv.setImageResource(R.drawable.las)
            }
            else if(i==4){
                imv.setImageResource(R.drawable.rzeka)
            }
            else if(i==5 || i==0){
                imv.setImageResource(R.drawable.gory)
                i=1
            }
        }
        poprzednie.setOnClickListener {
            i--
            if(i==-1 || i==0){
                imv.setImageResource(R.drawable.rzeka)
                i=4
            }
            else if(i==1){
                imv.setImageResource(R.drawable.gory)
            }
            else if(i==2){
                imv.setImageResource(R.drawable.jezioro)
            }
            else if(i==3){
                imv.setImageResource(R.drawable.las)
            }
            else if(i==4){
                imv.setImageResource(R.drawable.rzeka)
            }
        }
    }
}