package com.example.guiadewidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.* //te agrega esta libreria para usar el View BInding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //que ventana xml se esta enlazando con este codigo

        btnTexto.setOnClickListener {
            var intenttexto = Intent(applicationContext,TextoActivity::class.java) //Para abrir nuevas actividades
            startActivity(intenttexto)
        }

        btnBotones.setOnClickListener {
          var intentbotones = Intent (applicationContext, BotonesActivity::class.java)
            startActivity(intentbotones)
        }

        btnSeleccion.setOnClickListener {
           var intentseleccion = Intent(applicationContext,SeleccionActivity::class.java)
            startActivity(intentseleccion)
        }
        btnRegistro.setOnClickListener {
            var intentRegistro = Intent(applicationContext,RegistroActivity::class.java)
            startActivity(intentRegistro)
        }
    }
}