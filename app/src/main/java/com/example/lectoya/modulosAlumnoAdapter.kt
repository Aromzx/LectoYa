package com.example.lectoya

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class modulosAlumnoAdapter (private var mList: List<modulosAlumnoData>):
    RecyclerView.Adapter<modulosAlumnoAdapter.ModulosAlumnoViewHolder>(){

    inner class  ModulosAlumnoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombreModulo: TextView = itemView.findViewById(R.id.tvNombreModulo)
        val constraintLayout2: ConstraintLayout = itemView.findViewById(R.id.constraintLayout2)
        val cardViewLectura: CardView = itemView.findViewById(R.id.cvLectura)
        val constraintLayout3: ConstraintLayout = itemView.findViewById(R.id.constraintLayout3)
        val nombreLectura: TextView = itemView.findViewById(R.id.tvLectura)
        val nombreObra: TextView = itemView.findViewById(R.id.tvNombreObraEditar)
        val autorObra: TextView = itemView.findViewById(R.id.tvAutorObraEditar)
        val capituloObra: TextView = itemView.findViewById(R.id.tvCapituloObraEditar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModulosAlumnoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_modulos_alumno, parent, false)
        return ModulosAlumnoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ModulosAlumnoViewHolder, position: Int) {
        val modulosAlumnoData = mList[position]

        holder.nombreModulo.text = modulosAlumnoData.nombreModulo
        holder.nombreLectura.text = modulosAlumnoData.nombreLectura
        holder.nombreObra.text = modulosAlumnoData.nombreObraEditar
        holder.autorObra.text = modulosAlumnoData.autorObraEditar
        holder.capituloObra.text = modulosAlumnoData.capituloObraEditar

        val isExpandable: Boolean = modulosAlumnoData.isExpandable

        // Establecer la visibilidad inicial del CardView de lectura
        holder.cardViewLectura.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.constraintLayout2.setOnClickListener{
            isAnyItemExpandable(position)
            modulosAlumnoData.isExpandable = !modulosAlumnoData.isExpandable
            notifyItemChanged(position, Unit)
        }
    }

    private fun isAnyItemExpandable(position: Int){
        val temp = mList.indexOfFirst{
            it.isExpandable
        }
        if (temp >=0 && temp != position){
            mList[temp].isExpandable = false
            notifyItemChanged(temp, 0)
        }
    }
}