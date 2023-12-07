package com.example.beveragedecoratorpattern

class Espresso(description: String = "Espresso") : Beverage() {
    override fun cost(): Double {
        return 1.99
    }

}