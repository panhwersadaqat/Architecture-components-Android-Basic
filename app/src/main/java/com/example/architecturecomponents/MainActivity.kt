package com.example.architecturecomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
        Log.d("MAIN", "On created main activity called")
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