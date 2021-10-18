package com.example.companionobjectsapp

import android.graphics.Color
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    lateinit var layout:ConstraintLayout
    lateinit var edNightorDay:EditText
    lateinit var button: Button
    lateinit var tvbackground:TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layout =findViewById(R.id.root)
        edNightorDay = findViewById(R.id.edtext)
        button = findViewById(R.id.b1)
        tvbackground = findViewById(R.id.textv)

        button.setOnClickListener {
                var day_nigh= edNightorDay.text?.toString()
                when(day_nigh?.toLowerCase()){
                    "day" -> {
                        universe.background(layout,universe.day)
                        edNightorDay.setTextColor(Color.BLACK)
                        tvbackground.setTextColor(Color.BLACK)
                    }
                    "night" ->{
                        universe.background(layout,universe.night)
                        edNightorDay.setTextColor(Color.WHITE)
                        tvbackground.setTextColor(Color.WHITE)

                    }
                }
            }
        }

        }



