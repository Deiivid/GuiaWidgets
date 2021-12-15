package com.example.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class BotonesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones)
    }
    fun mostarBotonSeleccionado(widget: android.view.View) {
        var tag = widget.tag
       var mensaje = ""
        when (tag){
            "saludar" -> {
              mensaje="Hola soy un boton"
            }
            "email" ->{
                mensaje="Hola soy un ImageButton"
            }

        }
        Toast.makeText(applicationContext,mensaje ,Toast.LENGTH_LONG).show()
    }
}