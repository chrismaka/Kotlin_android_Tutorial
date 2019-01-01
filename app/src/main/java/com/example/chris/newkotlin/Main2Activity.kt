package com.example.chris.newkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun show(view: View) {
        val textView = findViewById<View>(R.id.text) as TextView
        textView.visibility = View.VISIBLE
    }
    fun hide(view: View) {
        val textView = findViewById<View>(R.id.text) as TextView
        textView.visibility = View.INVISIBLE
    }
}
