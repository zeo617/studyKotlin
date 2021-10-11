package com.jeho.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.jeho.studykotlin.databinding.ActivityThreadBinding

class ThreadActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThreadBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_thread)

        val runnable: Runnable = object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread1 is made")
            }
        }

        val thread: Thread = Thread(runnable)

        binding.threadBtn.setOnClickListener {
            thread.start()
        }

        // 두번째 방법
        Thread(object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread2 is made")
            }

        }).start()

        // 세번째 방법
        Thread(Runnable {
            Thread.sleep(2000)
            Log.d("thread-1", "Thread3 is made")
            runOnUiThread {
                binding.threadBtn.setBackgroundColor(resources.getColor(R.color.textview_color))
            }

        }).start()


    }
}