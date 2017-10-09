package com.example.yzy.helloagain

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_send.setOnClickListener {
            val text = (findViewById(R.id.edit_message) as EditText).text.toString()
            Utils.toast(this@MainActivity, text)
        }
    }
}
