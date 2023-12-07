package com.example.beveragedecoratorpattern

class HouseBlend(description: String = "House Blend Coffee") : Beverage() {
    override fun cost(): Double {
        return 0.89
    }
}