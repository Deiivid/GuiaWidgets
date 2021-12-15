package com.example.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro.*

class RegistroActivity : AppCompatActivity() {
    var sexo = "Hombre"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

    }
    fun registrar (view:View){
        var correo = edtCorreo.text.toString()
        var contrasenia = edtContrasenia.text.toString()
        if (radHombre.isChecked){
            sexo = "Hombre"
        }else{
            sexo = "Mujer"
        }
        var mensaje = "Tu correo es  $correo \n Tu contraseña es $contrasenia \n Tu sexo es  $sexo"

        Toast.makeText(applicationContext, mensaje, Toast.LENGTH_LONG).show()
    }
}