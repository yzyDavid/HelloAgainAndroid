package com.example.yzy.helloagain

/**
 * Created by yzy on 10/9/17.
 */

import android.app.Activity
import com.example.yzy.helloagain.DataModelA
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.jetbrains.anko.toast

object ControllerA {
    lateinit var activity: Activity
    fun test(): Unit {
        val gson = GsonBuilder().create()
        val res = gson.toJson("hello Gson!")
        activity.toast(res)
    }

    fun modelToGson(model: DataModelA): String {
        val gson = GsonBuilder().create()
        return gson.toJson(model) ?: ""
    }
}
