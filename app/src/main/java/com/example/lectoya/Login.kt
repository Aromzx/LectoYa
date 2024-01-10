package com.example.lectoya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button = findViewById<Button>(R.id.btnCrearcuenta)

        button.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.btnIniciarSesion)

        button2.setOnClickListener {
            val intent = Intent(this, AlumnoAula::class.java)
            startActivity(intent)
        }


    }
}