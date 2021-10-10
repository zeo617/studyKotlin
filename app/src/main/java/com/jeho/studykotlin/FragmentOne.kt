package com.jeho.studykotlin

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class FragmentOne : Fragment() {

    interface OnDataPassListener {
        fun onDataPass(data: String?)
    }

    lateinit var dataPassListener: OnDataPassListener

    override fun onAttach(context: Context) {
        Log.d("life_cycle", "F onAttach")
        super.onAttach(context)

        dataPassListener = context as OnDataPassListener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("life_cycle", "F onCreateView")
        // fragment 가 인터페이스를 처음으로 그릴 때 호출된다
        // inflater -> 뷰를 그려주는 역할
        // container -> 부모 뷰

        return inflater.inflate(R.layout.fragment_one, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onViewCreated")

        val data = arguments?.getString("hello")
        Log.d("data", data.toString())

        super.onViewCreated(view, savedInstanceState)

        // Activity Oncreate 에서 했던 작업을 여기에서 한다


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("life_cycle", "F onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_cycle", "F onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_cycle", "F onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_cycle", "F onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("life_cycle", "F onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("life_cycle", "F onDetach")
        super.onDetach()
    }
}