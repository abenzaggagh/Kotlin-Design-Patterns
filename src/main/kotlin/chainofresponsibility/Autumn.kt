package com.demo.chainofresponsibility

import com.demo.*
import java.awt.Color

class Autumn: Season() {

    override fun getOutfit(): Outfit {
        return if (CurrentSeason.currentSeason == SeasonEnum.AUTUMN) {
            OutfitBuilder()
                .addClothing(Shirt("Henley", Color.WHITE))
                .addClothing(Pants("Jeans", Color.BLACK))
                .addClothing(Shoes("Boots", "Boots", Color.WHITE))
                .build()
        } else {
            next()
        }
    }

    override fun next(): Outfit {
        return Spring().getOutfit()
    }

}