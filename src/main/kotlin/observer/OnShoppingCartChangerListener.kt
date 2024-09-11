package com.demo.observer

import com.demo.Outfit

interface OnShoppingCartChangerListener {

    fun onOutfitAdded(outfit: Outfit, numberOfItems: Int)

    fun onOutfitRemoved(outfit: Outfit, numberOfItems: Int)

}