package com.example.lectoya

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class alumnoDocenteAdapter(private var mList: List<alumnosDocenteData>): RecyclerView.Adapter<alumnoDocenteAdapter.AlumnosDocenteViewHolder>() {

    inner class  AlumnosDocenteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val nombreAlumnos: TextView = itemView.findViewById(R.id.nombreAlumnos)
        val etNota: EditText = itemView.findViewById(R.id.etNota)
        val constraintLayout: ConstraintLayout = itemView.findViewById(R.id.constraintLayout)

        fun collapseExpandeView(){
            etNota.visibility = View.GONE
        }
    }

    fun setFilteredList(mList: List<alumnosDocenteData>){
        this.mList = mList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnosDocenteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_alumnos_docente, parent, false)
        return AlumnosDocenteViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: AlumnosDocenteViewHolder, position: Int) {
        val alumnosDocenteData = mList[position]

        holder.nombreAlumnos.text = alumnosDocenteData.nombreAlumnos
        holder.etNota.setText(alumnosDocenteData.notas.toString())

        val isExpandable: Boolean = alumnosDocenteData.isExpandable
        holder.etNota.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.constraintLayout.setOnClickListener{
            isAnyItemExpandable(position)
            alumnosDocenteData.isExpandable = !alumnosDocenteData.isExpandable
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

    override fun onBindViewHolder(
        holder: AlumnosDocenteViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        if(payloads.isNotEmpty()&& payloads[0]==0){
            holder.collapseExpandeView()
        }else{
            super.onBindViewHolder(holder, position, payloads)
        }
    }
}