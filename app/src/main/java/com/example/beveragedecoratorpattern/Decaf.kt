package com.example.beveragedecoratorpattern

class Decaf(description: String = "Decaffeinated Coffee") : Beverage() {
    override fun cost(): Double {
        return 1.05
    }
}