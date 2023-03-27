package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Spinner

class second_activity : AppCompatActivity() {

    val lista = listOf<String>("Admin","User",)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.v("Lifecycle","onCreate")
        val spinner = findViewById<Spinner>(R.id.A2Spin)
        val adapter = ArrayAdapter(
            this@second_activity,
            android.R.layout.simple_spinner_item,
            lista
        )
        spinner.adapter = adapter
    }

}

