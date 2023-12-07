package com.example.beveragedecoratorpattern

class Whisk(b: Beverage) : CondimentDecorator() {
    private val beverage = b

    override val description: String
        get() = beverage.description + ", Whisk"

    override fun cost(): Double {
        return (0.10 + beverage.cost())
    }
}