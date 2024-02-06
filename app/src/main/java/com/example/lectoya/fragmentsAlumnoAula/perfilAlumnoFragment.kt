package com.example.lectoya.fragmentsAlumnoAula

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.lectoya.R

class perfilAlumnoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil_alumno, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editTexts: List<EditText> = listOf(
            view.findViewById(R.id.etNombresEstudiante),
            view.findViewById(R.id.etApellidosEstudiante),
            view.findViewById(R.id.etCorreoEstudiante),
            view.findViewById(R.id.etTipoDeLector)
        )

        for (editText in editTexts) {
            editText.isFocusable = false
        }

        val button: Button = view.findViewById(R.id.btnCerrarSesionAlumno)

        button.setOnClickListener {
            val showPopUp = CerrarSesionAlumno()
            showPopUp.show((activity as AppCompatActivity).supportFragmentManager, "showPopUp")
        }
    }
}
