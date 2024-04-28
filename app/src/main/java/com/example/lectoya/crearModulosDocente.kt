package com.example.lectoya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class crearModulosDocente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_modulos_docente)

        val btnSeleccionarJuegos = findViewById<Button>(R.id.btnSeleccionarJuegos)

        btnSeleccionarJuegos.setOnClickListener {
            val intent = Intent(this, seleccionarJuegosDocente::class.java)
            startActivity(intent)
        }

    }
}