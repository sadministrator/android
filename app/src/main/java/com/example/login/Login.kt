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
            val username = et_username.text.toString();
            //val password = et_password.text.toString();
            setContentView(R.layout.activity_main);

            val intent = Intent(this, MainActivity::class.java).apply {
                Toast.makeText(this@Login, username, Toast.LENGTH_LONG).show()
            }
            startActivity(intent)
        }
    }
}
