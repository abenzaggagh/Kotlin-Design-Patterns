package com.demo

import java.awt.Color

object OutfitFactory {

    fun getOutfit(style: OutfitStyle): Outfit {
        return when (style) {
            OutfitStyle.ADIDAS ->
                OutfitBuilder()
                    .setShirt(Shirt("T-Shirt", Color.BLACK))
                    .setPants(Pants("", Color.BLACK))
                    .setShoes(Shoes("Sneakers", "Adidas", Color.WHITE))
                    .build()
            OutfitStyle.APPLE -> getAppleOutfit()
            OutfitStyle.NIKE -> OutfitBuilder()
                .setShirt(Shirt("T-Shirt", Color.BLACK))
                .setPants(Pants("", Color.BLACK))
                .setShoes(Shoes("Sneakers", "Nike", Color.WHITE))
                .build()
            OutfitStyle.PUMA -> OutfitBuilder()
                .setShirt(Shirt("T-Shirt", Color.GRAY))
                .setPants(Pants("", Color.GRAY))
                .setShoes(Shoes("Sneakers", "Puma", Color.GRAY))
                .build()
        }
    }

    fun getAppleOutfit() : Outfit = OutfitBuilder()
        .setShirt(Shirt("Shirt", Color.BLACK))
        .setPants(Pants("Jeans", Color.BLACK))
        .setShoes(Shoes("Sneakers", "Nike", Color.WHITE))
        .addClothing(Watch("Apple", 49, Color.BLUE))
        .addClothing(Glasses("Vision Pro"))
        .build()
}