package com.jeho.studykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.jeho.studykotlin.databinding.ActivityIntent2Binding

class Intent2 : AppCompatActivity() {

    private lateinit var binding: ActivityIntent2Binding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_intent2)

        binding.resultId.setOnClickListener {

            val number1 = intent.getIntExtra("number1", 0)
            val number2 = intent.getIntExtra("number2", 0)

            Log.d("number", "" + number1)
            Log.d("number", "" + number2)

            val result = number1 + number2

            val resultIntent = Intent()
            resultIntent.putExtra("result", result)

            setResult(RESULT_OK, resultIntent)
            finish() // -> Activity 종료

            // Stack
            // Intent2 -> 종료
            // Intent1   Intent
        }


    }
}