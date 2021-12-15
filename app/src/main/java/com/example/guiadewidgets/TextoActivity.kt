package com.example.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.guiadewidgets.databinding.ActivityMainBinding
import com.example.guiadewidgets.databinding.ActivityTextoBinding


class TextoActivity : AppCompatActivity() {
    lateinit var  binding : ActivityTextoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityTextoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDatos.setOnClickListener {
            var nombre =binding.txtNombre.text.toString()
            var edad = binding.txtEdad.text.toString()
            Toast.makeText(applicationContext, "Hola $nombre tienes $edad años", Toast.LENGTH_SHORT).show()
        }
    }
}