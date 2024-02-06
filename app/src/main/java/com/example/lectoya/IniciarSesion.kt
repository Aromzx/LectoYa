package com.example.lectoya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class IniciarSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)

        //Llevar al usuario al Activity de Registro

        val button = findViewById<Button>(R.id.btnCrearcuenta)

        button.setOnClickListener {
            val intent = Intent(this, Registro::class.java)
            startActivity(intent)
        }

        //Llevar al usuario al Activity de Iniciar Sesion

        val button2 = findViewById<Button>(R.id.btnIniciarSesion)

        button2.setOnClickListener {
            val intent = Intent(this, AlumnoAula::class.java)
            startActivity(intent)
        }

        //Si se ingresan los datos de del docente y se presiona el checkbox
        //se le llevará a su apartado en especial.

        val cbDocente: CheckBox = findViewById(R.id.cbDocente)
        val btnIniciarSesion: Button = findViewById(R.id.btnIniciarSesion)
        val btnCrearCuenta: Button = findViewById(R.id.btnCrearcuenta)

        btnIniciarSesion.setOnClickListener {
            val intent: Intent = if (cbDocente.isChecked) {
                Intent(this, AulasDocente::class.java)
            } else {
                Intent(this, AlumnoAula::class.java)
            }
            startActivity(intent)
        }

        /*btnCrearCuenta.setOnClickListener {
            val intent: Intent = if (cbDocente.isChecked) {
                Intent(this, DocenteRegistroActivity::class.java)
            } else {
                Intent(this, EstudianteRegistroActivity::class.java)
            }
            startActivity(intent)
        }*/



    }
}