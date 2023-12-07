package com.example.beveragedecoratorpattern

import android.util.Log
import java.util.logging.Level
import java.util.logging.Logger

private val TAG = "MAIN_TAG"

fun main() {
    val beverage1: Beverage = Espresso()
    Log.d(TAG, "${beverage1.description} - /$${beverage1.cost()}")

    val beverage2: Beverage = DarkRoast()
    val mocha = Mocha(beverage2)
    val whisk = Whisk(beverage2)
    Log.d(TAG, "${beverage2.description} - /$${beverage2.cost()}")

    val beverage3: Beverage = HouseBlend()
    val milk = Milk(beverage3)
    Log.d(TAG, "${beverage3.description} - /$${beverage3.cost()}")
}