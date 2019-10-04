package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info.*

class Info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val myIntent = intent
        val number = myIntent.getStringExtra("number")
        val name = myIntent.getStringExtra("name")

        info_number.text="${number}"
        info_name.text="${name}"
    }
}