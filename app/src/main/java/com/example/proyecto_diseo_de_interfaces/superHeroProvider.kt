package com.example.proyecto_diseo_de_interfaces

class SuperHeroProvider {
    companion object{
        val superHeroList = listOf<SuperHero>(
            SuperHero(
                "Spiderman",
                "Marvel",
                "Peter Parker",
                "https://www.formulatv.com/images/series/posters/1800/1825/dest_1.jpg"
            ),
            SuperHero(
                "Superman",
                "DC",
                "Clark Kent",
                "https://i.pinimg.com/originals/3e/96/4a/3e964a43726c9f9ccad56ab25e2c1a0b.jpg"
            )
        )
    }
}