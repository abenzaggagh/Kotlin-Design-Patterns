package com.demo.chainofresponsibility

import com.demo.*
import java.awt.Color

class Summer : Season() {

    override fun getOutfit(): Outfit {
        return if (CurrentSeason.currentSeason == SeasonEnum.SUMMER) {
            OutfitBuilder()
                .addClothing(Glasses("Sunglasses"))
                .addClothing(Shirt("T-Shirt", Color.WHITE))
                .addClothing(Pants("Shorts", Color.BLACK))
                .addClothing(Shoes("Sandals", "Adidas", Color.WHITE))
                .build()
        } else {
            next()
        }
    }

    override fun next(): Outfit {
        // Generic Outfit, last case
        return OutfitBuilder()
            .addClothing(Shirt("Shirt", Color.WHITE))
            .addClothing(Pants("Jeans", Color.BLUE))
            .addClothing(Shoes("Sneakers", "Nike", Color.WHITE))
            .build()
    }
}