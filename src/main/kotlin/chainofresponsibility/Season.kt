package com.demo.chainofresponsibility

import com.demo.Outfit

abstract class Season {

    abstract fun getOutfit(): Outfit

    abstract fun next(): Outfit

}