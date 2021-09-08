package com.example.worktwoactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button)
        val edText: EditText = findViewById(R.id.value)



        btn.setOnClickListener{
            val text = edText.text.toString().trim()
            val data = Intent(this, ActivityTwo::class.java)
            data.putExtra("Message", text)
            startActivity(data)
        }
    }
}