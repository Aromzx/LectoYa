package com.example.lectoya

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class AulasDocente : AppCompatActivity() {

    private lateinit var rgAulas: RadioGroup
    private lateinit var btnAulas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aulas_docente)

        // Inicializar las variables
        rgAulas = findViewById(R.id.rgAulas)
        btnAulas = findViewById(R.id.btnAulas)

        // Deshabilitar el botón inicialmente
        btnAulas.isEnabled = false

        // Añadir un listener para el cambio de selección en el RadioGroup
        rgAulas.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.segundoa -> {
                    // Habilitar el botón
                    btnAulas.isEnabled = true
                }

                R.id.segundob -> {
                    // Habilita el botón
                    btnAulas.isEnabled = true
                }

                R.id.segundoc -> {
                    // Habilita el botón
                    btnAulas.isEnabled = true
                }

                R.id.segundod -> {
                    // Habilita el botón
                    btnAulas.isEnabled = true
                }

                R.id.segundoe -> {
                    // Habilita el botón
                    btnAulas.isEnabled = true
                }
                else -> {
                    // Deshabilitar el botón
                    btnAulas.isEnabled = false
                }
            }
        }

        // Modificar el código del botón para que al hacer clic en él, se inicie la Activity
        btnAulas.setOnClickListener {
            // Iniciar la Activity
            val intent = Intent(this, DocenteAula::class.java)
            startActivity(intent)
        }
    }
}