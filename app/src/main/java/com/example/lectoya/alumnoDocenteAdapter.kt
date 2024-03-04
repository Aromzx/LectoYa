package com.example.lectoya

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class alumnoDocenteAdapter(private var mList: List<alumnosDocenteData>): RecyclerView.Adapter<alumnoDocenteAdapter.AlumnosDocenteViewHolder>() {

    inner class  AlumnosDocenteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val nombreAlumnos: TextView = itemView.findViewById(R.id.nombreAlumnos)
        val constraintLayout: ConstraintLayout = itemView.findViewById(R.id.constraintLayout)
        val etNota1: EditText = itemView.findViewById(R.id.etNota1)
        val etNota2: EditText = itemView.findViewById(R.id.etNota2)
        val etNota3: EditText = itemView.findViewById(R.id.etNota3)
        val etNota4: EditText = itemView.findViewById(R.id.etNota4)
        val etNota5: EditText = itemView.findViewById(R.id.etNota5)
        val etNota6: EditText = itemView.findViewById(R.id.etNota6)
        val etNota7: EditText = itemView.findViewById(R.id.etNota7)
        val etNota8: EditText = itemView.findViewById(R.id.etNota8)
        val etNota9: EditText = itemView.findViewById(R.id.etNota9)
        val etNota10: EditText = itemView.findViewById(R.id.etNota10)

        val tvNota1: TextView = itemView.findViewById(R.id.tvNota1)
        val tvNota2: TextView = itemView.findViewById(R.id.tvNota2)
        val tvNota3: TextView = itemView.findViewById(R.id.tvNota3)
        val tvNota4: TextView = itemView.findViewById(R.id.tvNota4)
        val tvNota5: TextView = itemView.findViewById(R.id.tvNota5)
        val tvNota6: TextView = itemView.findViewById(R.id.tvNota6)
        val tvNota7: TextView = itemView.findViewById(R.id.tvNota7)
        val tvNota8: TextView = itemView.findViewById(R.id.tvNota8)
        val tvNota9: TextView = itemView.findViewById(R.id.tvNota9)
        val tvNota10: TextView = itemView.findViewById(R.id.tvNota10)

        val btnGuardar: Button = itemView.findViewById(R.id.btnGuardar)

        fun collapseExpandeView(){
            etNota1.visibility = View.GONE
            etNota2.visibility = View.GONE
            etNota3.visibility = View.GONE
            etNota4.visibility = View.GONE
            etNota5.visibility = View.GONE
            etNota6.visibility = View.GONE
            etNota7.visibility = View.GONE
            etNota8.visibility = View.GONE
            etNota9.visibility = View.GONE
            etNota10.visibility = View.GONE

            tvNota1.visibility = View.GONE
            tvNota2.visibility = View.GONE
            tvNota3.visibility = View.GONE
            tvNota4.visibility = View.GONE
            tvNota5.visibility = View.GONE
            tvNota6.visibility = View.GONE
            tvNota7.visibility = View.GONE
            tvNota8.visibility = View.GONE
            tvNota9.visibility = View.GONE
            tvNota10.visibility = View.GONE

            btnGuardar.visibility = View.GONE
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

        holder.etNota1.setText(alumnosDocenteData.notas.toString())
        holder.etNota2.setText(alumnosDocenteData.notas.toString())
        holder.etNota3.setText(alumnosDocenteData.notas.toString())
        holder.etNota4.setText(alumnosDocenteData.notas.toString())
        holder.etNota5.setText(alumnosDocenteData.notas.toString())
        holder.etNota6.setText(alumnosDocenteData.notas.toString())
        holder.etNota7.setText(alumnosDocenteData.notas.toString())
        holder.etNota8.setText(alumnosDocenteData.notas.toString())
        holder.etNota9.setText(alumnosDocenteData.notas.toString())
        holder.etNota10.setText(alumnosDocenteData.notas.toString())



        val isExpandable: Boolean = alumnosDocenteData.isExpandable
        holder.etNota1.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.etNota2.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.etNota3.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.etNota4.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.etNota5.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.etNota6.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.etNota7.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.etNota8.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.etNota9.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.etNota10.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.tvNota1.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.tvNota2.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.tvNota3.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.tvNota4.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.tvNota5.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.tvNota6.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.tvNota7.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.tvNota8.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.tvNota9.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.tvNota10.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.btnGuardar.visibility = if (isExpandable) View.VISIBLE else View.GONE

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