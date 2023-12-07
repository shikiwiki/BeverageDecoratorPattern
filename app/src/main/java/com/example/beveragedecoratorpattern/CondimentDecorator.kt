package com.example.beveragedecoratorpattern

abstract class CondimentDecorator : Beverage() {
    abstract override val description: String
}