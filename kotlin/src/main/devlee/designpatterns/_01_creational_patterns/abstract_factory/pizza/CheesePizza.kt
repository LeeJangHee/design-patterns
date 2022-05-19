package main.devlee.designpatterns._01_creational_patterns.abstract_factory.pizza

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.PizzaAF
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.factory.PizzaIngredientFactory

class CheesePizza(private val ingredientFactory: PizzaIngredientFactory) : PizzaAF() {
    override fun prepare() {
        println("Preparing: $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}