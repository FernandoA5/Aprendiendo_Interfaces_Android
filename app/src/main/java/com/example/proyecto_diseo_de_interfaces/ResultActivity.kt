package com.example.proyecto_diseo_de_interfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyecto_diseo_de_interfaces.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getAndShowName()
        binding.btnBack.setOnClickListener{ onBackPressed() }
        binding.btnLogin.setOnClickListener{
            validarClave()
        }
    }
    private fun validarClave()
    {
        if(binding.textBoxPassword.text.isNotEmpty()){
            if(binding.textBoxPassword.text.toString()=="emma"){
                val intent = Intent(this, RecyclerSH::class.java)
                intent.putExtra("INTENT_NAME", binding.textBoxPassword.text)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Contraseña invalida pendejo", Toast.LENGTH_SHORT).show()
            }
        }else{
            Toast.makeText(this, "Campo de contraseña vacío", Toast.LENGTH_SHORT).show()
        }
    }
    private fun getAndShowName(){
        val bundle=intent.extras
        val name = bundle?.get("INTENT_NAME")
        binding.textViewSaludo.text="Bienvenido ${name.toString()}".uppercase()
    }
}