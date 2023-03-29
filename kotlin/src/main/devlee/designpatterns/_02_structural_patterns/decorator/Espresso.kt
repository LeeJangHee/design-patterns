package main.devlee.designpatterns._02_structural_patterns.decorator

class Espresso : Beverage {

    override fun getDescription(): String {
        return "Espresso"
    }

    override fun cost(): Double {
        return 1.99
    }
}