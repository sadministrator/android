package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var textBtn: Button? = null
    private var recycleBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textBtn = findViewById(R.id.text_btn) as Button
        recycleBtn = findViewById(R.id.recycle_btn) as Button

        textBtn!!.setOnClickListener { addFragment(TextFragment(), false, "text") }
        recycleBtn!!.setOnClickListener { addFragment(RecycleFragment(), false, "recycle") }
    }

    fun addFragment(fragment: Fragment, addToBackStack: Boolean, tag: String) {
        val manager = supportFragmentManager
        val ft = manager.beginTransaction()

        if(addToBackStack) {
            ft.addToBackStack(tag)
        }

        ft.replace(R.id.fragment_container, fragment, tag)
        ft.commitAllowingStateLoss()
    }
}
