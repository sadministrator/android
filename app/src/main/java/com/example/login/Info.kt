package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info.*

class Info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_info);

        val number = intent.getStringExtra("number")
        val name = intent.getStringExtra("name")

        info_number.text = number
        info_name.text = name
    }
}