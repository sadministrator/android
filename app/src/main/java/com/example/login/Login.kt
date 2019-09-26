package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        submit_button.setOnClickListener {
           // Toast.makeText(this, "qwe", Toast.LENGTH_LONG).show()
            val user = username.text.toString();

            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("name", user)
            }
        }
    }
}
