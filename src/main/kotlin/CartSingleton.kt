package com.demo

import com.demo.observer.OnShoppingCartChangerListener

// In Kotlin, you only need to declare a Singleton
// with the modifier object instead of class
object CartSingleton {

    private val outfits: ArrayList<Outfit> = ArrayList()

    private val listeners = ArrayList<OnShoppingCartChangerListener>()
    // Kotlin doesn't have static variables and methods.
    // Classic way to do the singleton, Kotlin has object modifier
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
        listeners.forEach {
            it.onOutfitAdded(outfit, outfit.size())
        }
    }

    fun removeOutfit(outfit: Outfit) {
        if (outfits.contains(outfit)) {
            outfits.remove(outfit)
            listeners.forEach {
                it.onOutfitRemoved(outfit, outfit.size())
            }
        }
    }

    fun getOutfits(): List<Outfit> {
        return outfits
    }

    fun addListener(listener: OnShoppingCartChangerListener) {
        println("Listener added")
        listeners.add(listener)
    }

    fun removeListener(listener: OnShoppingCartChangerListener) {
        if (listeners.contains(listener)) {
            println("Listener removed")
            listeners.remove(listener)
        }
    }

    override fun toString(): String {
        var result = "Outfits in the cart : \n"
        outfits.forEach {
            result += "$it"
        }
        return result
    }

}