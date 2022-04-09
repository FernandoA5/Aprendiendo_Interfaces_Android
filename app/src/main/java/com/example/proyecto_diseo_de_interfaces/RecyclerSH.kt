package com.example.proyecto_diseo_de_interfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyecto_diseo_de_interfaces.databinding.ActivityRecyclerShBinding
import com.example.proyecto_diseo_de_interfaces.databinding.ActivityResultBinding

class RecyclerSH : AppCompatActivity() {
    private lateinit var binding:ActivityRecyclerShBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerShBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener{
            onBackPressed()
        }
    }
}