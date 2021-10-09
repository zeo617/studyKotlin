package com.jeho.studykotlin.Android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.jeho.studykotlin.R
import com.jeho.studykotlin.databinding.ActivityCalculator04Binding

class Calculator_04 : AppCompatActivity() {

    private lateinit var binding: ActivityCalculator04Binding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator04)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_calculator04)


        // new -> old (new + old)
        var new = "0"
        var old = "0"

        binding.oneId.setOnClickListener {
            new += "1"
            binding.resultId.setText(new)
        }
        binding.twoId.setOnClickListener {
            new += "2"
            binding.resultId.setText(new)
        }
        binding.threeId.setOnClickListener {
            new += "3"
            binding.resultId.setText(new)
        }
        binding.fourId.setOnClickListener {
            new += "4"
            binding.resultId.setText(new)
        }
        binding.fiveId.setOnClickListener {
            new += "5"
            binding.resultId.setText(new)
        }
        binding.sixId.setOnClickListener {
            new += "6"
            binding.resultId.setText(new)
        }
        binding.sevenId.setOnClickListener {
            new += "7"
            binding.resultId.setText(new)
        }
        binding.eightId.setOnClickListener {
            new += "8"
            binding.resultId.setText(new)
        }
        binding.nineId.setOnClickListener {
            new += "9"
            binding.resultId.setText(new)
        }
        binding.zeroId.setOnClickListener {
            new += "0"
            binding.resultId.setText(new)
        }

        binding.plusId.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            binding.resultId.setText(old)
        }
        binding.clear.setOnClickListener {
            new = "0"
            old = "0"
            binding.resultId.setText("0")
        }


    }
}