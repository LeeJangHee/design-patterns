package main.devlee.designpatterns._02_structural_patterns.decorator

class Whip(override val beverage: Beverage) : CondimentDecorator() {

    override fun getDescription(): String {
        return beverage.getDescription() + ", Whip"
    }
    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}