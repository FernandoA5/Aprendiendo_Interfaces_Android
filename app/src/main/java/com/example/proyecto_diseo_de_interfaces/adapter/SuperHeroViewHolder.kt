package com.example.proyecto_diseo_de_interfaces.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.proyecto_diseo_de_interfaces.SuperHero
import com.example.proyecto_diseo_de_interfaces.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero){
        binding.textViewSuperHero.text= superHeroModel.superHero
        binding.textViewRealName.text=superHeroModel.realName
        binding.textViewPublisher.text=superHeroModel.publisher

        Glide.with(binding.imageViewSuperHero.context).load(superHeroModel.photo).into(binding.imageViewSuperHero)    }
}