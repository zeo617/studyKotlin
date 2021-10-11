package com.jeho.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import com.jeho.studykotlin.Kotlin.Car

class AddViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_view)

        // 아이템 리스트 준비
        val carList = ArrayList<CarForList>()
        for (i in 0 until 10) {
            carList.add(CarForList("" + i + " 번째 자동차", "" + i + " 순위 엔진"))
        }

        val container = findViewById<LinearLayout>(R.id.addViewContainer)
        val inflater = LayoutInflater.from(this@AddViewActivity)
        for (i in 0 until carList.size) {
            val itemView = inflater.inflate(R.layout.item_view, null)
            val carNameView = itemView.findViewById<TextView>(R.id.carName)
            val carEngineView = itemView.findViewById<TextView>(R.id.carEngine)

            carNameView.setText(carList.get(i).name)
            carEngineView.setText(carList.get(i).engine)
            container.addView(itemView)
        }

    }


}

class CarForList(val name: String, val engine: String) {

}
