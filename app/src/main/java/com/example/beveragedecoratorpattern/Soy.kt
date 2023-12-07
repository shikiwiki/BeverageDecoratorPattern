package com.example.beveragedecoratorpattern

class Soy(b: Beverage) : CondimentDecorator() {
    private val beverage = b

    override val description: String
        get() = beverage.description + ", Soy milk"

    override fun cost(): Double {
        return (0.15 + beverage.cost())
    }
}