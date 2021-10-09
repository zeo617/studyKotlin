package com.jeho.studykotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.jeho.studykotlin.databinding.ActivityIntentBinding

class Intent1 : AppCompatActivity() {

    private lateinit var binding: ActivityIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_intent)


        binding.changeActivity.setOnClickListener {

//            val intent = Intent(this@Intent1, Intent2::class.java)
//
//            // Key, Value 방식 -> Key 와 Value를 쌍으로 만들어 저장한다 (Dictionary)
//            intent.putExtra("number1", 1)
//            intent.putExtra("number2", 2)
//            startActivity(intent)


//            val intent2 = Intent(this@Intent1, Intent2::class.java)
//
//            // Apply -> apply 안에 putExtra 가 모두 들어있기에 코드를 읽기 편하다
//            intent2.apply {
//                this.putExtra("number1", 1)
//                this.putExtra("number2", 2)
//            }
//            startActivityForResult(intent2, 200)

              // 암시적 Intent
              val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
              startActivity(intent)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode == 200) {
            Log.d("number", "" + requestCode)
            Log.d("number", "" + resultCode)
            val result = data?.getIntExtra("result", 0)
            Log.d("number", "" + result)
        }

        super.onActivityResult(requestCode, resultCode, data)
    }
}