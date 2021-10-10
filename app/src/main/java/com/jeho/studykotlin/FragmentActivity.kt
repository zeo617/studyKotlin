package com.jeho.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.FragmentManager

class FragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        Log.d("life_cycle", "onCreate")

        // 프라그먼트를 동적으로 작동하는 방법
        val fragmentOne: FragmentOne = FragmentOne()

        // 프라그먼트에 data를 넣어주는 방법
        val bundle: Bundle = Bundle()
        bundle.putString("hello", "hello")
        fragmentOne.arguments = bundle

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            // fragment 붙이는 방법 replace/add
            val fragmentManager: FragmentManager = supportFragmentManager

            // Transaction
            // 작업의 단위 -> 시작과 끝이 있다
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragmentOne)
            fragmentTransaction.commit()

            // 끝을 내는 방법
            // commit -> 시간 될 때 해 (조금 더 안정적)
            // commitnow -> 지금 당장 해
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {

            // fragment remove/detach 하는 방법
            val fragmentManager: FragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()

            fragmentTransaction.remove(fragmentOne)
            fragmentTransaction.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("life_cycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("life_cycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("life_cycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle", "onDestroy")
    }
}