package main.devlee.designpatterns._02_structural_patterns.decorator

class Decaf : Beverage {

    override fun getDescription(): String {
        return "Decaf Coffee"
    }
    override fun cost(): Double {
        return 1.05
    }
}