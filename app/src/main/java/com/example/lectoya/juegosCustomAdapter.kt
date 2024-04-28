package com.example.lectoya

import android.text.style.BackgroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

/*Sirve para poblar toda la información en el recyclerview*/
class juegosCustomAdapter: RecyclerView.Adapter<juegosCustomAdapter.ViewHolder>(){

    val tittles = arrayOf("Historias Interactivas",
        "¿Ahora qué haremos?",
        "Dale un significado",
        "El dado de las preguntas",
        "Verdadero o Falso",
        "4 Opciones",
        "Cambialo Ya!")

    val details = arrayOf("Transforma historias y explora finales inesperados al controlar los destinos de los personajes.",
        "Este juego te desafía a resolver dilemas narrativos guiando personajes hacia soluciones ingeniosas.",
        "Desafía tu interpretación seleccionando tres palabras clave para desbloquear etapas y descubrir significados ocultos, mejorando tu habilidad de forma divertida.",
        "Haz que la lectura sea interactiva: lanza dados, responde preguntas específicas y profundiza tu comprensión de manera única y entretenida.",
        "Test de una pregunta, donde debes dar la respuesta con un verdadero o falso",
        "Test de una pregunta, se te presentarán 4 opciones donde deberás seleccionar la correcta",
        "Con las emociones propuestas crea el final como si fueras el personaje. ¡Adopta la emoción y cambia el destino!")

    val images = intArrayOf(R.drawable.historiasinteractivas,
        R.drawable.ahoraqueharemos,
        R.drawable.daleunsignificado,
        R.drawable.dadodepreguntas,
        R.drawable.verdaderoofalso,
        R.drawable.testopciones,
        R.drawable.improya)


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout,viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = tittles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int {
        return tittles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)

        }
    }
}