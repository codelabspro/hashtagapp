package com.codesdk.mobile.hashtagapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    fun main() {

        val channelName: String = "CodeSDK"
        var weight = 160
        var percentage: Double = 2.5
        var isAvailable: Boolean = true
        var s1 = "Call me"
        var s2 = " Maybe"
        val names = mutableListOf<String>("Ali", "Maya", "Chen")


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        main()
    }
}