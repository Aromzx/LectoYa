package com.example.lectoya.fragmentsDocenteAula

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.lectoya.AlumnoAula
import com.example.lectoya.IniciarSesion
import com.example.lectoya.R
import com.example.lectoya.eliminarCuentaDocente

class perfilDocenteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil_docente, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editTexts: List<EditText> = listOf(
            view.findViewById(R.id.etNombresDocente),
            view.findViewById(R.id.etApellidosDocente),
            view.findViewById(R.id.etCorreoDocente)
        )

        for (editText in editTexts) {
            editText.isFocusable = false
        }

        val button: Button = view.findViewById(R.id.btnCerrarSesionDocente)

        button.setOnClickListener{
            val showPopUp = CerrarSesionDocente()
            showPopUp.show((activity as AppCompatActivity).supportFragmentManager, "showPopUp")
        }

        val btneliminarcuenta: Button = view.findViewById(R.id.btnEliminarCuentaDocente)

        btneliminarcuenta.setOnClickListener {
            val intent = Intent(requireActivity(), eliminarCuentaDocente::class.java)
            startActivity(intent)
        }

    }
    }