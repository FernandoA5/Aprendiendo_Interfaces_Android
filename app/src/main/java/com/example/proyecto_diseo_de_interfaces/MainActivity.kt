package com.example.proyecto_diseo_de_interfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.proyecto_diseo_de_interfaces.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loginButton.setOnClickListener {
            checkMail()
        }

    }
    fun checkMail(){
        if(binding.textBoxUser.text.isNotEmpty()){
            //COOL
        }else{
            showError()
        }
    }
    fun showError(){
        Toast.makeText(this, "El nombre del usuario está vacío, ", Toast.LENGTH_SHORT).show()
    }
}