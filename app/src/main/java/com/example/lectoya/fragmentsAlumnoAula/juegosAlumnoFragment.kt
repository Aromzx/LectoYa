package com.example.lectoya.fragmentsAlumnoAula

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lectoya.R
import com.example.lectoya.alumnoDocenteAdapter
import com.example.lectoya.juegosCustomAdapter
import com.example.lectoya.modulosAlumnoAdapter
import com.example.lectoya.modulosAlumnoData

class juegosAlumnoFragment : Fragment() {

    private lateinit var recyclerView2: RecyclerView
    private var mList = ArrayList<modulosAlumnoData>()
    private lateinit var adapter: modulosAlumnoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_juegos_alumno, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView2 = view.findViewById(R.id.recyclerViewModulos)

        recyclerView2.setHasFixedSize(true)
        recyclerView2.layoutManager = LinearLayoutManager(requireContext())

        addDataToList()
        adapter = modulosAlumnoAdapter(mList)
        recyclerView2.adapter = adapter

        /*Esto es lo que da el error, pero a la vez es importante para el recycler view*/
        /*val recyclerView = view.findViewById<RecyclerView>(R.id.rvJuegos)
        val adapter = juegosCustomAdapter()

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter*/
    }
    private fun addDataToList(){
        mList.add(modulosAlumnoData("Modulo 1", "Lectura", "Agua", "José María Arguedas", "1"))
        mList.add(modulosAlumnoData("Modulo 2", "Lectura", "Agua", "José María Arguedas", "1"))
        mList.add(modulosAlumnoData("Modulo 3", "Lectura", "Agua", "José María Arguedas", "1"))

    }
}

