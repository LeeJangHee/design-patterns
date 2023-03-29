package main.devlee.designpatterns._02_structural_patterns.decorator

class Milk(override val beverage: Beverage) : CondimentDecorator() {

    override fun getDescription(): String {
        return beverage.getDescription() + ", Milk"
    }
    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}