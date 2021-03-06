package com.example.proyecto_diseo_de_interfaces

import android.app.Instrumentation
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.proyecto_diseo_de_interfaces.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //ESTO INICIALIZA EL BINDING
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //DEFINIMOS EL BINDING
        binding = ActivityMainBinding.inflate(layoutInflater)
        //PASAMOS COMO PARAMETRO LO QUE QUEREMOS QUE SE VISUALIZE
        setContentView(binding.root)
        //LISTENER DEL BOTNO LOGIN
        binding.loginButton.setOnClickListener {
            checkMail()
        }

    }
    //FUNCIÓN QUE REVISA QUE EL CORREO NO ESTÉ VACIO
    fun checkMail(){
        if(binding.textBoxUser.text.isNotEmpty()){
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("INTENT_NAME", binding.textBoxUser.text)
            startActivity(intent)
        }else{
            showError()
        }
    }
    //FUNCIÓN QUE MUESTRA EL ERROR
    fun showError(){
        Toast.makeText(this, "El nombre del usuario está vacío, ", Toast.LENGTH_SHORT).show()
    }
}