package main.devlee.designpatterns._02_structural_patterns.decorator

class Mocha(override val beverage: Beverage) : CondimentDecorator() {

    override fun getDescription(): String {
        return beverage.getDescription() + ", Mocha"
    }
    override fun cost(): Double {
        return .20 + beverage.cost()
    }
}