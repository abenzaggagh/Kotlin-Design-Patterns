package com.demo.chainofresponsibility

import com.demo.*
import java.awt.Color

class Spring: Season() {

    override fun getOutfit(): Outfit {
        return if (CurrentSeason.currentSeason == SeasonEnum.SPRING) {
            OutfitBuilder()
                .addClothing(Shirt("Shirt", Color.WHITE))
                .addClothing(Pants("Jeans", Color.BLACK))
                .addClothing(Shoes("Sneakers", "Nike", Color.WHITE))
                .build()
        } else {
            next()
        }
    }

    override fun next(): Outfit {
        return Summer().getOutfit()
    }
}