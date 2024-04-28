package com.example.lectoya

data class modulosAlumnoData(val nombreModulo: String,
                             val nombreLectura: String,
                             val nombreObraEditar: String,
                             val autorObraEditar: String,
                             val capituloObraEditar: String,
                             var isExpandable: Boolean= false)
