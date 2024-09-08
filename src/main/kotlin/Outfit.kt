package com.demo

import java.awt.Color

class Outfit(
    var hat: Hat?,
    var glasses: Glasses?,
    var shirt: Shirt,
    var watch: Watch?,
    var belt: Belt?,
    var pants: Pants,
    var shoes: Shoes) {

    override fun toString(): String {
        var outfit = "Outfit is :${shirt.type} with ${pants.type} Pants and ${shoes.brand} Shoes."
        outfit += "\n" + "Additional Outfit :"

        if (hat != null) {
            outfit += "\n" + "Hat :" + hat!!.type
        }

        if (glasses != null) {
            outfit += "\n" + "Glasses :" + glasses!!.type
        }

        if (belt != null) {
            outfit += "\n" + "Belt with size :" + belt!!.size
        }

        if (watch != null) {
            outfit += "\n" + "Watch with size :" + watch!!.size
        }

        return outfit
    }

}

interface Clothing { }

class Shirt (var type: String, var color: Color) : Clothing { }
class Pants (var type: String, var color: Color) : Clothing { }
class Shoes (var type: String, var brand: String, var color: Color) : Clothing { }

class Glasses(var type: String): Clothing {}
class Hat(var type: String, var brand: String): Clothing {}
class Belt(var size: Int, var color: Color): Clothing {}
class Watch(var brand: String, var size: Int, var color: Color): Clothing {}