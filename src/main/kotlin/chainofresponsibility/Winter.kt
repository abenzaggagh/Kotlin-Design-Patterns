package com.demo.chainofresponsibility

import com.demo.*
import java.awt.Color

class Winter: Season() {

    override fun getOutfit(): Outfit {
        return if (CurrentSeason.currentSeason == SeasonEnum.WINTER) {
            OutfitBuilder()
                .addClothing(Shirt("Jacket", Color.WHITE))
                .addClothing(Pants("Shorts", Color.BLACK))
                .addClothing(Shoes("Sandals", "Adidas", Color.WHITE))
                .build()
        } else {
            next()
        }
    }

    override fun next(): Outfit {
        return Autumn().getOutfit()
    }

}