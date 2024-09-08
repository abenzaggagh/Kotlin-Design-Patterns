package com.demo

// In Kotlin, you only need to declare a Singleton with the modifier object instead of class
object CartSingleton {

    private val outfits: ArrayList<Outfit> = ArrayList()

    // Kotlin doesn't have static variables and methods.
    /* companion object {

        private var instance: CartSingleton? = null

        fun getInstance(): CartSingleton {
            if (instance == null) {
                instance = CartSingleton()
            }
            return instance as CartSingleton
        }
    } */

    fun addOutfit(outfit: Outfit) {
        outfits.add(outfit)
    }

    fun removeOutfit(outfit: Outfit) {
        if (outfits.contains(outfit)) {
            outfits.remove(outfit)
        }
    }

    fun getOutfits(): List<Outfit> {
        return outfits
    }

}