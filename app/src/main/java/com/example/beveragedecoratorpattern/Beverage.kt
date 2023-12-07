package com.example.beveragedecoratorpattern

abstract class Beverage {
    open val description = "Unknown beverage"

    abstract fun cost(): Double
}