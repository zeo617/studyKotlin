package com.jeho.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class LibraryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        val glide = findViewById<ImageView>(R.id.glide)
        val glide2 = findViewById<ImageView>(R.id.glide2)

        Glide.with(this@LibraryActivity)
            .load("https://img.cowellfashion.com/data/goods/77/0000007177/basic_0000007177_large.jpg")
            .centerCrop()
            .into(glide)

        Glide.with(this@LibraryActivity)
            .load("https://img.cowellfashion.com/data/goods/77/0000007177/basic_0000007177_large.jpg")
            .fitCenter()
            .into(glide2)

    }
}