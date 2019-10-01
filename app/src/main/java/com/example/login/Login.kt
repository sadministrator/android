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

        btn_submit.setOnClickListener {
           // Toast.makeText(this, "qwe", Toast.LENGTH_LONG).show()
            val username = et_username.text.toString();
            val password = et_password.text.toString();
            setContentView(R.layout.activity_main);

            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("user", username)
                putExtra("pass", password)
                Toast.makeText(this@Login, username, Toast.LENGTH_LONG).show()
            }
        }
    }
}
