package main.devlee.designpatterns._01_creational_patterns.abstract_factory

abstract class PizzaStoreAF {

    abstract fun createPizza(item: PizzaTypeAF): PizzaAF

    fun orderPizza(type: PizzaTypeAF): PizzaAF {
        val pizza: PizzaAF = createPizza(type)
        println("--- Making a ${pizza.name} ---")
        return pizza.apply {
            prepare()
            bake()
            cut()
            box()
        }
    }
}