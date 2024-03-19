package com.example.lectoya

import android.text.style.BackgroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class juegosCustomAdapter: RecyclerView.Adapter<juegosCustomAdapter.ViewHolder>(){

    val tittles = arrayOf("Historias Interactivas",
        "¿Ahora qué haremos?",
        "Dale un significado",
        "El dado de las preguntas",
        "Cambio de destino",
        "Dibuja tu camino",
        "Captura el momento",
        "Tutti Frutti Literario",
        "Ordenalo Ya",
        "Cambialo Ya!")

    val details = arrayOf("Transforma historias y explora finales inesperados al controlar los destinos de los personajes.",
        "Este juego te desafía a resolver dilemas narrativos guiando personajes hacia soluciones ingeniosas.",
        "Desafía tu interpretación seleccionando tres palabras clave para desbloquear etapas y descubrir significados ocultos, mejorando tu habilidad de forma divertida.",
        "Haz que la lectura sea interactiva: lanza dados, responde preguntas específicas y profundiza tu comprensión de manera única y entretenida.",
        "Permite reescribir finales, donde tus elecciones determinan el destino de los personajes y transforman tramas en historias.",
        "Demuestra creatividad y resolución en este juego al dibujar y escribir soluciones a desafíos emocionantes, creando un camino único hacia el éxito.",
        "Tras leer una obra, captura una foto que refleje un elemento de la historia, explorando la creatividad visual y conectando con la narrativa.",
        "Veamos cuanto sabes de la obra, compite con tus compañeros y completa las casillas lo más rápido posible. ",
        "Organiza la historia en 5 pequeñas oraciones para que pueda recordar toda la obra. Acompáñalo con 5 imágenes propuestas.",
        "Con las emociones propuestas crea el final como si fueras el personaje. ¡Adopta la emoción y cambia el destino!")

    val images = intArrayOf(R.drawable.historiasinteractivas,
        R.drawable.ahoraqueharemos,
        R.drawable.daleunsignificado,
        R.drawable.dadodepreguntas,
        R.drawable.cambiodedestino,
        R.drawable.dibujatucamino,
        R.drawable.capturaelmomentojuego,
        R.drawable.tuttifrutti,
        R.drawable.ordenaloya,
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