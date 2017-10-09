/**
* Created by yzy on 10/1/17.
*/

package com.example.yzy.helloagain

import android.app.Activity
import android.widget.Toast
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException
import org.jetbrains.anko.toast as ankoToast

object Utils {
    @JvmStatic
    fun toast(owner: Activity, message: String) = Toast.makeText(owner, message, Toast.LENGTH_SHORT).show()

    @JvmStatic
    fun get(url: String): String {
        val client = OkHttpClient()
        val request = Request.Builder().url(url).build()
        val response = client.newCall(request).execute()
        return response.body()?.string() ?: throw IOException()
    }
}
