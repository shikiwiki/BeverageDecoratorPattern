package com.example.beveragedecoratorpattern

class Mocha(b: Beverage) : CondimentDecorator() {
    private val beverage = b

    override val description: String
        get() = beverage.description + ", Mocha"

    override fun cost(): Double {
        return (0.20 + beverage.cost())
    }
}