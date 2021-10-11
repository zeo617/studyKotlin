package com.jeho.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NullSafety : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        val number: Int = 10
        val number1: Int? = null

        // val number3 = number? + number1
        val number3 = number1?.plus(number)
        Log.d("number", "number3 : " + number3)

        // 삼항연산자 -> 엘비스 연산자(?:)
        // Null safety 를 위한 도구
        val number4 = number1 ?: 10
        Log.d("number", "number4 : " + number4)

        // number5는 Int 타입이기 때문에 null 값을 가지고 있는 number1 때문에 에러발생
        // val number5: Int = number1 + 10

        // null 값을 가지고 있는 number1이 null 이 아님을 보장하기 위해 "!!"를 붙여줌
        // 개발자가 보장하는 것이기 때문에 실수가 날 수 있다
        val number5: Int = number1!! + 10


    }

    fun plus(a: Int, b: Int?): Int {
        if (b != null) return a + b
        else return a
    }

    fun plus2(a: Int, b: Int?): Int? {
        return b?.plus(a)
    }

}