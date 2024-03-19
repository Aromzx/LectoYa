package com.example.lectoya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

val finales = arrayOf(
    "Un final con mucho miedo",
    "Un final con mucho suspenso",
    "Un final con mucho amor",
    "Un final con mucha ira",
)
class cambialoYa : AppCompatActivity() {

    fun mostrarFinalAleatorio() {
        val indiceAleatorio = (0 until finales.size).random()
        val textViewFinal = findViewById<TextView>(R.id.tvEmocion)
        textViewFinal.text = finales[indiceAleatorio]
        textViewFinal.visibility = View.VISIBLE
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambialo_ya)

        mostrarFinalAleatorio()
    }
}