package com.example.beveragedecoratorpattern

class Milk(b: Beverage) : CondimentDecorator() {
    private val beverage = b

    override val description: String
        get() = beverage.description + ", Milk"

    override fun cost(): Double {
        return (0.10 + beverage.cost())
    }
}