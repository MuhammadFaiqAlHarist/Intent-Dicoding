package com.faiq.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithData : AppCompatActivity() {

    companion object{
        const val EXTRA_AGE = "Extra Age"
        const val EXTRA_NAME = "Extra Name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_width_data)

        val tvDataReceived: TextView = findViewById(R.id.tv_data)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)

        val text = "Name : $name, \n Age : $age"
        tvDataReceived.text = text
    }
}