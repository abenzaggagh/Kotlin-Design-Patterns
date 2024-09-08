package com.demo

class OutfitBuilder {

    private var hat: Hat? = null
    private var glasses: Glasses? = null
    private var watch: Watch? = null
    private var shirt: Shirt? = null
    private var belt: Belt? = null
    private var pants: Pants? = null
    private var shoes: Shoes? = null

    private var clothes = ArrayList<Clothing>()

    fun setHat(hat: Hat): OutfitBuilder {
        this.hat = hat
        return this
    }

    fun setGlasses(glasses: Glasses): OutfitBuilder {
        this.glasses = glasses
        return this
    }

    fun setWatch(watch: Watch): OutfitBuilder {
        this.watch = watch
        return this
    }

    fun setShirt(shirt: Shirt): OutfitBuilder {
        this.shirt = shirt
        return this
    }

    fun setBelt(belt: Belt): OutfitBuilder {
        this.belt = belt
        return this
    }

    fun setPants(pants: Pants): OutfitBuilder {
        this.pants = pants
        return this
    }

    fun setShoes(shoes: Shoes): OutfitBuilder {
        this.shoes = shoes
        return this
    }

    fun addClothing(clothing: Clothing): OutfitBuilder {
        clothes.add(clothing)
        return this
    }

    fun build(): Outfit {
        clothes.forEach {
            when (it) {
                is Hat -> hat = it
                is Glasses -> glasses = it
                is Watch -> watch = it
                is Shirt -> shirt = it
                is Belt -> belt = it
                is Pants -> pants = it
                is Shoes -> shoes = it
            }
        }

        if (shirt == null || pants == null || shoes == null) {
            throw IllegalArgumentException("Outfit must have at least a shirt, a pant and shoes.")
        }

        return Outfit(
            shirt = shirt!!,
            pants = pants!!,
            shoes = shoes!!,
            hat = hat,
            belt = belt,
            glasses = glasses,
            watch = watch
        )
    }



}