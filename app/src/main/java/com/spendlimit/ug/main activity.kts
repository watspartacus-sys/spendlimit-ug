package com.spendlimit.ug

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "SpendLimit UG\n\nSmart spending limits for MTN MoMo, Airtime & Banks\n\nComing Soon..."
        tv.textSize = 20f
        tv.setPadding(60, 300, 60, 60)
        setContentView(tv)
    }
}
