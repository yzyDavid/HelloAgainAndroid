package com.example.yzy.helloagain

/**
 * Created by yzy on 10/9/17.
 */

import android.app.Activity
import com.example.yzy.helloagain.DataModelA
import com.google.gson.Gson
import com.google.gson.GsonBuilder

object ControllerA {
    lateinit var activity: Activity
    fun test(model: DataModelA): Unit {
        val gson = GsonBuilder().create()
        val res = gson.toJson("hello Gson!")
    }
}