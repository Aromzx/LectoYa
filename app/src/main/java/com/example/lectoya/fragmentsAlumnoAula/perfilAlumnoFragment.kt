package com.example.lectoya.fragmentsAlumnoAula

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lectoya.R
import java.util.Random

class perfilAlumnoFragment : Fragment() {

    //Array de los tips de lecturas

    private lateinit var btnTipLectura: Button
    private val tipsLectura = listOf(
        "Lee en un lugar tranquilo y con buena iluminación.",
        "Toma descansos para evitar la fatiga visual.",
        "Utiliza un marcador para resaltar las ideas importantes.",
        "Toma notas sobre lo que lees para mejorar la comprensión.",
        "Relaciona lo que lees con tus conocimientos y experiencias.",
        "Lee en diferentes formatos (libros, artículos, blogs, etc.).",
        "Explora diferentes géneros literarios.",
        "Dedica un tiempo específico a la lectura cada día.",
        "Convierte la lectura en un hábito placentero.",
        "Haz preguntas mientras lees para comprender mejor el texto.",
        "Lee sobre temas que te gusten.",
        "Lee en voz alta para mejorar la atención y comprensión.",
        "La lectura es un hábito que se desarrolla con el tiempo.",
        "Hay muchos recursos para mejorar tus habilidades."
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil_alumno, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //inhabilita los edit text para que solo se muestre información

        val editTexts: List<EditText> = listOf(
            view.findViewById(R.id.etNombresEstudiante),
            view.findViewById(R.id.etApellidoPaternoEstudiante),
            view.findViewById(R.id.etApellidoMaternoEstudiante),
            view.findViewById(R.id.etCorreoEstudiante),
            view.findViewById(R.id.etDocumentodeidentidadAlumno),
            view.findViewById(R.id.etTipoDeLector)
        )

        for (editText in editTexts) {
            editText.isFocusable = false
        }

        //Metodo de cerrar sesión

        val button: Button = view.findViewById(R.id.btnCerrarSesionAlumno)

        button.setOnClickListener {
            val showPopUp = CerrarSesionAlumno()
            showPopUp.show((activity as AppCompatActivity).supportFragmentManager, "showPopUp")
        }

        //Tips de lectura aleatorio con Toast

        btnTipLectura = view.findViewById(R.id.btnTipLectura)

        btnTipLectura.setOnClickListener {
            val indiceAleatorio = Random().nextInt(tipsLectura.size)
            val tipAleatorio = tipsLectura[indiceAleatorio]

            // Mostrar el tip de lectura en un Toast
            Toast.makeText(context?.applicationContext, "Tip de lectura: $tipAleatorio", Toast.LENGTH_SHORT).show()

                }

        }


    }
