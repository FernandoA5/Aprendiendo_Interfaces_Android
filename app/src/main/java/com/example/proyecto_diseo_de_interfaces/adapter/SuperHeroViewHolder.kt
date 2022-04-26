package com.example.proyecto_diseo_de_interfaces.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.proyecto_diseo_de_interfaces.SuperHero
import com.example.proyecto_diseo_de_interfaces.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    //INSTANCIAMOS EL BINDING
    val binding = ItemSuperheroBinding.bind(view)

    //FUNCIÓN QUE DEFINE LOS VALORES DE CADA ELEMENTO
    fun render(superHeroModel: SuperHero, onClickListener: (SuperHero) -> Unit) {
        //SETEAMOS CAMPOS
        binding.textViewSuperHero.text = superHeroModel.superHero
        binding.textViewRealName.text = superHeroModel.realName
        binding.textViewPublisher.text = superHeroModel.publisher
        //SETEAMOS IMAGEN
        Glide.with(binding.imageViewSuperHero.context).load(superHeroModel.photo)
            .into(binding.imageViewSuperHero)
        itemView.setOnClickListener{
            onClickListener(superHeroModel)
        }
    }
}