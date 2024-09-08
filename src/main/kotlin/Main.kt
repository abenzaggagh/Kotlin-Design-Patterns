package com.demo

import java.awt.Color

fun main() {
    println("Hello World!")

    val outfit = OutfitBuilder()
        .setHat(Hat("Golf Hat", "Nike"))
        .setBelt(Belt(60, Color.BLACK))
        .setPants(Pants("Jeans", Color.BLUE))
        .addClothing(Shirt("T-Shirt", Color.RED))
        .addClothing(Shoes("Sneakers", "Nike", Color.WHITE))
        .build()

    println(outfit.toString())

    val outfitException = OutfitBuilder()
        .setBelt(Belt(60, Color.BLACK))
        .addClothing(Shirt("T-Shirt", Color.RED))
        .build()

    println(outfitException.toString())

    // Very simple to use
    CartSingleton.addOutfit(outfit)

}