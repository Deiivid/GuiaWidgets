package com.example.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_texto.*

class TextoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_texto)
        btnDatos.setOnClickListener {
            var nombre =txtNombre.text.toString()
            var edad = txtEdad.text.toString()
            Toast.makeText(applicationContext, "Hola $nombre tienes $edad años", Toast.LENGTH_SHORT).show()
        }
    }
}