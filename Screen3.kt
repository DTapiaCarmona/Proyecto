package com.example.test8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)
        val boton10: Button = findViewById(R.id.button10)
        boton10.setOnClickListener {
            val intent: Intent = Intent(this, Producto:: class.java)
            startActivity(intent)
        }
    }
}