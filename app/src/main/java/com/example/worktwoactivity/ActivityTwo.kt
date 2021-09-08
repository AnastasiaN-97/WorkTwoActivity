package com.example.worktwoactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity_two)

        val data =intent?.getStringExtra("Message")
        val result: TextView =  findViewById(R.id.result)
        result.text = data?: "Упс, ошибка"

    }


}