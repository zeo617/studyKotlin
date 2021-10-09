package com.jeho.studykotlin.Android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.jeho.studykotlin.Kotlin.hello
import com.jeho.studykotlin.R
import org.w3c.dom.Text


class Listener_03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)


        // 뷰를 activity 로 가져오는 방법

        val helloId: TextView = findViewById(R.id.hello)
        val imageId: ImageView = findViewById(R.id.image)

        var number = 10

        helloId.setOnClickListener {
            Log.d("click", "Click!!")
            helloId.setText("안녕하세요")
            imageId.setImageResource(R.drawable.stroke)
            number += 10
            Log.d("number", "" + number)

        }


        // 뷰를 조작하는 함수들
        // textView.setText("안녕하세요")
        //


    }
}