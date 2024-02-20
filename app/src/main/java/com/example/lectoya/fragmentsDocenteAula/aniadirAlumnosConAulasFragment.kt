package com .example.lectoya.fragmentsDocenteAula

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import com.example.lectoya.R


class aniadirAlumnosConAulasFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aniadir_alumnos_con_aulas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editTexts: List<EditText> = listOf(
            view.findViewById(R.id.etAula2doA),
            view.findViewById(R.id.etAula2doB),
            view.findViewById(R.id.etAula2doC),
            view.findViewById(R.id.etAula2doD),
            view.findViewById(R.id.etAula2doE)
        )

        for (editText in editTexts) {
            editText.isFocusable = false
        }

        val editText = view.findViewById<EditText>(R.id.etAula2doA)
        val copyButton = view.findViewById<Button>(R.id.btnCopiarAulaA)

        copyButton.setOnClickListener {
            val text = editText.text.toString()

            val clipboard = context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("Copied text", text)
            clipboard.setPrimaryClip(clip)

            Toast.makeText(context, "Texto copiado al portapapeles", Toast.LENGTH_SHORT).show()
        }
    }

}