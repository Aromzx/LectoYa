package com.example.lectoya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class dadoDeLasPreguntas : AppCompatActivity() {

    val textosDado = arrayOf(
        "Este libro trata sobre...",
        "Lo que más me gustó fue...",
        "El personaje que más llamó mi atención fue...",
        "No me gustó cuando...",
        "Lo que menos me sorprendió fue cuando...",
        "El final fue interesante porque..."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dado_de_las_preguntas)

        val btnLanzar: Button = findViewById(R.id.btnLanzarDado)

        btnLanzar.setOnClickListener {
            rollDice()
        }
        rollDice()
    }

    private fun rollDice() {
        var indice: Int = lanzar(5)
        val tvResultado: TextView = findViewById(R.id.tvResultado)
        tvResultado.text = textosDado[indice]

        val drawableResource = when (indice) {
            1 -> R.drawable.dado1
            2 -> R.drawable.dado2
            3 -> R.drawable.dado3
            4 -> R.drawable.dado4
            5 -> R.drawable.dado5
            else -> R.drawable.dado6
        }

        val imgDado: ImageView = findViewById(R.id.ivImagenDado)
        imgDado.setImageResource(drawableResource)
    }

    private fun lanzar(max: Int): Int {
        return (0 until max).random()
    }
}