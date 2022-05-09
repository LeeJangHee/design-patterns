package main.devlee.designpatterns._01_creational_patterns._02_factory.simple.chicago

import main.devlee.designpatterns._01_creational_patterns._02_factory.simple.Pizza
import main.devlee.designpatterns._01_creational_patterns._02_factory.simple.PizzaStore
import main.devlee.designpatterns._01_creational_patterns._02_factory.simple.PizzaType

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(item: PizzaType): Pizza {
        return when(item) {
            PizzaType.CHEESE -> ChicagoStyleCheesePizza()
            PizzaType.CLAM -> ChicagoStyleClamPizza()
            PizzaType.TOMATO -> ChicagoStyleTomatoPizza()
            PizzaType.VEGGIE -> ChicagoStyleVeggiePizza()
            else -> throw IllegalArgumentException()
        }
    }
}