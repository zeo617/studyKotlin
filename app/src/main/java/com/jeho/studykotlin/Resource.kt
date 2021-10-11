package com.jeho.studykotlin

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Resource : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        // 1
        val ment = resources.getString(R.string.hello)
        Log.d("mentt", "ment : " + ment)

        // 2
        val ment2 = getString(R.string.hello)
        Log.d("mentt", "ment : " + ment)


        // SDK 버전에 따른 분기 처리
        val resourceBtn = findViewById<Button>(R.id.resourceBtn)

        val color = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            resourceBtn.setBackgroundColor(getColor(R.color.textview_color))

        } else {
            resourceBtn.setBackgroundColor(resources.getColor(R.color.textview_color))

        }



    }
}