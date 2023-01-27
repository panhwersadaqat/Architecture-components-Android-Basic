package com.example.architecturecomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var tv: TextView
    private lateinit var button:Button
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
        Log.d("MAIN", "On created main activity called")

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        tv = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        viewModel.countLiveData.observe(this, Observer {
            tv.text = it.toString()
        })

        button.setOnClickListener {
            viewModel.increment()
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