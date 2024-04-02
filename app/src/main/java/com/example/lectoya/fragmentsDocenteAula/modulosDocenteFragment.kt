package com.example.lectoya.fragmentsDocenteAula

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.lectoya.R
import com.example.lectoya.mostrarJuegos

class modulosDocenteFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_modulos_docente, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*Ver el activity lista de Juegos*/
        val btnListaDeJuegos = view.findViewById<Button>(R.id.btnListaDeJuegos)

        btnListaDeJuegos.setOnClickListener {
            val intent = Intent(requireActivity(), mostrarJuegos::class.java)
            startActivity(intent)
        }

        

    }

}