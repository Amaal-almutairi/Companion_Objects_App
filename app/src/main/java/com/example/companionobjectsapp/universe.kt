package com.example.companionobjectsapp

import android.view.View

class universe {
    companion object {
        val night = 0
        val day = 1

        fun background(layout: View, d: Int) {
            when (d) {
                0 -> {
                    layout.setBackgroundResource(R.drawable.night)
                }
                1 -> {
                    layout.setBackgroundResource(R.drawable.day)
                }
            }
        }
    }
}
