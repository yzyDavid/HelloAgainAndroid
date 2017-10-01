package com.example.yzy.helloagain

/**
* Created by yzy on 10/1/17.
*/

import android.app.Activity
import android.widget.Toast

object Utils {
    @JvmStatic
    fun toast(owner: Activity, message: String) = Toast.makeText(owner, message, Toast.LENGTH_SHORT).show()
}
