package com.example.lectoya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class IniciarSesion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)

        //Botón -> Registro Alumno

        val button = findViewById<Button>(R.id.btnCrearcuenta)

        button.setOnClickListener {
            val intent = Intent(this, Registro::class.java)
            startActivity(intent)
        }

        //Text View -> Olvidé mi contraseña

        val tvOlvidemicontraseña: TextView = findViewById(R.id.tvOlvidemicontraseña)

        tvOlvidemicontraseña.setOnClickListener {
            // Iniciar la actividad "RecuperarContraseña"
            val intent = Intent(this, recuperarContrasenia::class.java)
            startActivity(intent)
        }

        //Botón crear cuenta + CheckBox Docente -> Crear cuenta Docente

        val btnCrearCuenta: Button = findViewById(R.id.btnCrearcuenta)
        val cbDocente: CheckBox = findViewById(R.id.cbDocente)

        btnCrearCuenta.setOnClickListener {
            val intent: Intent = if (cbDocente.isChecked) {
                Intent(this, RegistroDocente::class.java)
            } else {
                Intent(this, Registro::class.java)
            }
            startActivity(intent)
        }

        //Checkbox Docente -> LLeva al aula del docente

        /*Se declaran estas variables para ocuparlas luego
        val etCorreo: EditText = findViewById(R.id.etCorreo)
        val etContraseña: EditText = findViewById(R.id.etContraseña)
        */

        val btnIniciarSesion: Button = findViewById(R.id.btnIniciarSesion)

        btnIniciarSesion.setOnClickListener {

            /*La url
            val url = "https://pokeapi.co/api/v2/pokemon/1"
            */
             val intent: Intent?
             if (cbDocente.isChecked) {

                /*
                Log.d("asdfg", "error")
                val prueba: VolleySingleton = VolleySingleton.getInstance(this)
                prueba.loginUser(this, url, etCorreo.text.toString(), etContraseña.text.toString(),
                    { response ->

                        Log.d("response",response.toString())
                    },
                    { error ->
                        Log.d("Error", "eror")
                    }
                )
                */

                 intent = Intent(this, AulasDocente::class.java)
            } else {
                 intent = Intent(this, AlumnoAula::class.java)

                /*val editTextCorreo = findViewById<EditText>(R.id.etCorreo)
                val editTextContrasenia = findViewById<EditText>(R.id.etContraseña)

                val textoCorreo = editTextCorreo.text.toString()
                val textoContrasenia = editTextContrasenia.text.toString()

                Toast.makeText(this, "El correo electrónico es: $textoCorreo", Toast.LENGTH_SHORT).show()
                Toast.makeText(this, "La contraseña es: $textoContrasenia", Toast.LENGTH_SHORT).show()*/
            }
            startActivity(intent)
        }

    }
}