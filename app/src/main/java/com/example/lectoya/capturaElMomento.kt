package com.example.lectoya

import android.app.Activity
import android.app.Instrumentation
import android.app.Instrumentation.ActivityResult
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts

class capturaElMomento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_captura_el_momento)

        val btnCamara = findViewById<Button>(R.id.btnCapturaElMomento)

        btnCamara.setOnClickListener {
            startForResult.launch(Intent(MediaStore.ACTION_IMAGE_CAPTURE))
        }
    }

    private val startForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        result: androidx.activity.result.ActivityResult ->
        if(result.resultCode == Activity.RESULT_OK){
            val intent = result.data
            val imageBitmap = intent?.extras?.get("data") as Bitmap
            val imageView = findViewById<ImageView>(R.id.ivCapturaElMomento)
            imageView.setImageBitmap(imageBitmap)
        }
    }
}