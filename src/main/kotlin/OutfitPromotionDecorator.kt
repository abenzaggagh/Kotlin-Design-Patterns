package com.demo

class OutfitPromotionDecorator(
    val outfit: Outfit,
    var promotion: String) {

    fun changePromotion(newPromotion: String) {
        promotion = newPromotion
    }

    override fun toString(): String {
        return "$outfit \nDiscount $promotion"
    }

}