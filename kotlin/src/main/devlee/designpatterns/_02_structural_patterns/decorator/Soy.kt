package main.devlee.designpatterns._02_structural_patterns.decorator

class Soy(override val beverage: Beverage) : CondimentDecorator() {

    override fun getDescription(): String {
        return beverage.getDescription() + ", Soy"
    }
    override fun cost(): Double {
        return .15 + beverage.cost()
    }
}