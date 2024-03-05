package com.example.lectoya

import android.content.Context
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

    class VolleySingleton private constructor(context: Context) {
        companion object {
            @Volatile
            private var INSTANCE: VolleySingleton? = null

            fun getInstance(context: Context) =
                INSTANCE ?: synchronized(this) {
                    INSTANCE ?: VolleySingleton(context).also {
                        INSTANCE = it
                    }
                }
        }

        val requestQueue: RequestQueue by lazy {
            Volley.newRequestQueue(context.applicationContext)
        }
        // Función para realizar la petición POST para el inicio de sesión
        fun loginUser(context: Context, url: String, email: String, password: String, onResponseListener: (JSONObject) -> Unit, onErrorListener: (String) -> Unit) {
            // Crear un objeto JSON con las credenciales del usuario
            val jsonObject = JSONObject().apply {
                put("email", email)
                put("password", password)
            }

            // Crear la solicitud POST
            val jsonObjectRequest = JsonObjectRequest(
                Request.Method.GET, url, jsonObject,
                Response.Listener { response ->
                    onResponseListener(response)
                },
                Response.ErrorListener { error ->
                    onErrorListener(error.message ?: "Error desconocido")
                })

            // Agregar la solicitud a la cola de solicitudes de Volley
            VolleySingleton.getInstance(context).requestQueue.add(jsonObjectRequest)
        }
    }

