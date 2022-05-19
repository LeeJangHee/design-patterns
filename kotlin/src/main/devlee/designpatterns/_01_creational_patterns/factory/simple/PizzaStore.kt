package main.devlee.designpatterns._01_creational_patterns.factory.simple

abstract class PizzaStore {

    abstract fun createPizza(item: PizzaType): Pizza

    fun orderPizza(type: PizzaType): Pizza {
        val pizza: Pizza = createPizza(type)
        println("--- Making a ${pizza.name} ---")
        return pizza.apply {
            prepare()
            bake()
            cut()
            box()
        }
    }
}