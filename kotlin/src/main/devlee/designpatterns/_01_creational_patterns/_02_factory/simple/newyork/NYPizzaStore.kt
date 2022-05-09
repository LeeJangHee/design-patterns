package main.devlee.designpatterns._01_creational_patterns._02_factory.simple.newyork

import main.devlee.designpatterns._01_creational_patterns._02_factory.simple.Pizza
import main.devlee.designpatterns._01_creational_patterns._02_factory.simple.PizzaStore
import main.devlee.designpatterns._01_creational_patterns._02_factory.simple.PizzaType

class NYPizzaStore: PizzaStore() {
    override fun createPizza(item: PizzaType): Pizza {
        return when(item) {
            PizzaType.CHEESE -> NYStyleCheesePizza()
            PizzaType.TOMATO -> NYStyleTomatoPizza()
            PizzaType.CLAM -> NYStyleClamPizza()
            PizzaType.VEGGIE -> NYStyleVeggiePizza()
            else -> throw IllegalArgumentException()
        }
    }
}