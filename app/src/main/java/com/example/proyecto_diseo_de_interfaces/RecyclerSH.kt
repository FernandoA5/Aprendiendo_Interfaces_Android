package com.example.proyecto_diseo_de_interfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyecto_diseo_de_interfaces.adapter.SuperHeroAdapter
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
        initRecyclerView()
    }
    fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        val decoration= DividerItemDecoration(this, manager.orientation)
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = manager
        recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList){
            superHero ->  onItemSelected(superHero)
        }
        recyclerView.addItemDecoration(decoration)
    }
    fun onItemSelected(superHero: SuperHero){
        Toast.makeText(this, superHero.superHero, Toast.LENGTH_SHORT).show()
    }
}