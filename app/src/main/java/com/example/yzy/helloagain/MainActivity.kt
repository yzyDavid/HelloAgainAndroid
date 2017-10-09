package com.example.yzy.helloagain

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    val LOG_INFO_TAG = "Quick Log"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_send.setOnClickListener {
            val text = edit_message.text.toString()
            Utils.toast(this@MainActivity, text)
        }
    }

    fun toastAndLog(message: String) {
        toast(message)
        Log.i(LOG_INFO_TAG, message)
    }
}
