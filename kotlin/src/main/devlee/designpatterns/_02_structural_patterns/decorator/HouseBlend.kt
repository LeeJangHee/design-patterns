package main.devlee.designpatterns._02_structural_patterns.decorator

class HouseBlend : Beverage {
    override fun getDescription(): String {
        return "House Blend Coffee"
    }
    override fun cost(): Double {
        return .99
    }
}