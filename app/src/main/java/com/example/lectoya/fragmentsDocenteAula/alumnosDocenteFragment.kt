package com.example.lectoya.fragmentsDocenteAula

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.text.Editable
import android.text.InputFilter
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.SearchView.OnQueryTextListener
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lectoya.R
import com.example.lectoya.alumnoDocenteAdapter
import com.example.lectoya.alumnosDocenteData
import com.example.lectoya.juegosCustomAdapter
import java.util.Locale
import kotlin.io.path.fileVisitor

class alumnosDocenteFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private var mList = ArrayList<alumnosDocenteData>()
    private lateinit var adapter: alumnoDocenteAdapter

    //Variables para el guardado de notas



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alumnos_docente, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recyclerView = view.findViewById(R.id.recyclerView)
        searchView = view.findViewById(R.id.search_view)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        addDataToList()
        adapter = alumnoDocenteAdapter(mList)
        recyclerView.adapter = adapter

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })

    }

    private fun filterList(query: String?){
        if(query !=null){
            val filteredList = ArrayList<alumnosDocenteData>()
            for (i in mList){
                if (i.nombreAlumnos.lowercase(Locale.ROOT).contains(query)){
                    filteredList.add(i)
                }
            }

            if (filteredList.isEmpty()){
                Toast.makeText(context, "No se encontró al alumno", Toast.LENGTH_LONG).show()
            }else{
                adapter.setFilteredList(filteredList)
            }
        }
    }

    private fun addDataToList(){
        mList.add(alumnosDocenteData("Alumno 1 - "))
        mList.add(alumnosDocenteData("Alumno 2 - "))
        mList.add(alumnosDocenteData("Alumno 3 - "))
        mList.add(alumnosDocenteData("Alumno 4 - "))
        mList.add(alumnosDocenteData("Alumno 5 - "))
        mList.add(alumnosDocenteData("Alumno 6 - "))
        mList.add(alumnosDocenteData("Alumno 7 - "))
        mList.add(alumnosDocenteData("Alumno 8 - "))
        mList.add(alumnosDocenteData("Alumno 9 - "))
        mList.add(alumnosDocenteData("Alumno 10 - "))
    }

}