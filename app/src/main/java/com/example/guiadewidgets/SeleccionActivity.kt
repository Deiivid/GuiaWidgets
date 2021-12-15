package com.example.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Switch
import android.widget.Toast


class SeleccionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion)
    }

    fun validaSeleccion(view: android.view.View) {
        if (view is CheckBox) {
            if (view.isChecked) {
                Toast.makeText(applicationContext, "Check seleccionado", Toast.LENGTH_LONG).show()
            } else {

                Toast.makeText(applicationContext, "Check no seleccionado", Toast.LENGTH_LONG)
                    .show()
            }

        } else if (view is Switch) {
            if (view.isChecked) {
                Toast.makeText(applicationContext, "Switch seleccionado", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Switch no seleccionado", Toast.LENGTH_LONG).show()
            }
        } else if (view is RadioButton){
            when (view.id){
                R.id.radioUno ->{
                    Toast.makeText(applicationContext, "Selecionaste RadioButton 1", Toast.LENGTH_LONG).show()
                }
                R.id.radioDos ->{
                    Toast.makeText(applicationContext, "Selecionaste RadioButton 2", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}