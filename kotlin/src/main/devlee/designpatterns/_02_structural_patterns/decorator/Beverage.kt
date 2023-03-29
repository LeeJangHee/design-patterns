package main.devlee.designpatterns._02_structural_patterns.decorator

interface Beverage {

    fun getDescription(): String {
        return "Unknown Beverage"
    }

    fun cost(): Double
}