package com.example.beveragedecoratorpattern

class DarkRoast(description: String = "Dark Roast Coffee") : Beverage() {
    override fun cost(): Double {
        return 0.99
    }
}