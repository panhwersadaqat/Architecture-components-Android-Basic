package com.example.architecturecomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tv: TextView
    private lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
        Log.d("MAIN", "On created main activity called")

        tv = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            tv.text = "${tv.text.toString().toInt() + 1}"
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MAIN", "On start main activity called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN", "On resume main activity called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN", "On pause main activity called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAIN", "On stop main activity called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN", "On destroy main activity called")
    }

}