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
        "Tutti Frutti",
        "Ordenalo Ya",
        "Impro Ya!")

    val details = arrayOf("¿Cómo te gustaría que termine la historia?",
        "Responde a una pregunta sobre la lectura",
        "Escribe el significado de 3 palabras del parrafo",
        "Distintas preguntas según el número del dado que salga",
        "Cambia el final a lo leído y dibuja algo referente a ello",
        "Responde a una pregunta sobre la lectura y dibújalo",
        "Luego de haber leído la obra, captura una foto que aparezca en ella",
        "2 imagenes, 2 preguntas",
        "5 pequeñas oraciones, ordena de manera descendente según la obra leída",
        "Te daremos una emoción, cambia el final y que esté relacionado a eso")

    val images = intArrayOf(R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,)


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