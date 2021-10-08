package com.jeho.studykotlin.Android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.jeho.studykotlin.Kotlin.hello
import com.jeho.studykotlin.R

class Listener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)


        // 뷰를 activity 로 가져오는 방법

        // 1) 직접 찾아서 가져온다
        // val textView: TextView = findViewById(R.id.hello)

        // 2) xml 을 import 해서 가져온다
        // hello.

    }
}