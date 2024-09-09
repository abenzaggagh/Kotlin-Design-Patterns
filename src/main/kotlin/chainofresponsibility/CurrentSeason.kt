package com.demo.chainofresponsibility

import com.demo.Outfit

class CurrentSeason {

    companion object {
        val currentSeason = SeasonEnum.SUMMER;
    }

    fun getOutfitForCurrentSeason(): Outfit = Winter().getOutfit()

}

enum class SeasonEnum {
    WINTER, AUTUMN, SPRING, SUMMER;
}