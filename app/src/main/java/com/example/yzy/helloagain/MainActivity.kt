package com.example.yzy.helloagain

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.calendarView
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    private val LOG_INFO_TAG = "Quick Log"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ControllerA.activity = this

        button_send.setOnClickListener {
            val text = edit_message.text.toString()
            Utils.toast(this@MainActivity, text)
            ControllerA.test()
        }

        button_try.setOnClickListener {
            var id = 0
            try {
                id = Integer.parseInt(edit_id.text.toString())
            } catch (e: NumberFormatException) {
            }
            ControllerA.modelToGson(DataModelA(
                    edit_name.text.toString(),
                    id,
                    edit_opt.text.toString())).let {
                toastAndLog(it)
            }
        }

        button_intent.setOnClickListener {
            val intent = Intent(this, ScrollingActivity::class.java)
            startActivity(intent)
        }
    }

    private fun toastAndLog(message: String) {
        toast(message)
        Log.i(LOG_INFO_TAG, message)
    }
}
