package com.example.guiadewidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.guiadewidgets.databinding.ActivityRegistroBinding


class RegistroActivity : AppCompatActivity() {
    var sexo = "Hombre"
    lateinit var  binding : ActivityRegistroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    fun registrar (view:View){
        var correo = binding.edtCorreo.text.toString()
        var contrasenia = binding.edtContrasenia.text.toString()
        if (binding.radHombre.isChecked){
            sexo = "Hombre"
        }else{
            sexo = "Mujer"
        }
        var mensaje = "Tu correo es  $correo \n Tu contraseña es $contrasenia \n Tu sexo es  $sexo"

        Toast.makeText(applicationContext, mensaje, Toast.LENGTH_LONG).show()
    }
}