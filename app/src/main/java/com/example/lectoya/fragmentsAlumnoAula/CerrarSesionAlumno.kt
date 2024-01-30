package com.example.lectoya.fragmentsAlumnoAula

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.example.lectoya.Login
import com.example.lectoya.R

class CerrarSesionAlumno : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cerrar_sesion_alumno, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn1 = view.findViewById<Button>(R.id.btnSialumno)
        val btn2 = view.findViewById<Button>(R.id.btnNoalumno)


        btn1.setOnClickListener {
            val intent = Intent(requireActivity(), Login::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            dismiss()
        }
    }

}