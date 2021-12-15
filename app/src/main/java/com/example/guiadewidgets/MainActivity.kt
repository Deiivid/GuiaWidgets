package com.example.guiadewidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.guiadewidgets.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) //que ventana xml se esta enlazando con este codigo

        binding.btnTexto.setOnClickListener {
            var intenttexto = Intent(applicationContext,TextoActivity::class.java) //Para abrir nuevas actividades
            startActivity(intenttexto)
        }

        binding.btnBotones.setOnClickListener {
          var intentbotones = Intent (applicationContext, BotonesActivity::class.java)
            startActivity(intentbotones)
        }

        binding.btnSeleccion.setOnClickListener {
           var intentseleccion = Intent(applicationContext,SeleccionActivity::class.java)
            startActivity(intentseleccion)
        }
        binding.btnRegistro.setOnClickListener {
            var intentRegistro = Intent(applicationContext,RegistroActivity::class.java)
            startActivity(intentRegistro)
        }
    }
}