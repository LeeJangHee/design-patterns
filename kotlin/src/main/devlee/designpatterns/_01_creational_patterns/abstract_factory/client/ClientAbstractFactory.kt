package main.devlee.designpatterns._01_creational_patterns.abstract_factory.client

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.PizzaTypeAF


fun main() {
    val nyStore = NYPizzaStore()
    val chicagoStore = ChicagoPizzaStore()

    var pizzaAF = nyStore.orderPizza(PizzaTypeAF.CHEESE)
    println("A 주문 피자: $pizzaAF")

    pizzaAF = chicagoStore.orderPizza(PizzaTypeAF.TOMATO)
    println("B 주문 피자: $pizzaAF")

    pizzaAF = chicagoStore.orderPizza(PizzaTypeAF.VEGGIE)
    println("C 주문 피자: $pizzaAF")

    pizzaAF = nyStore.orderPizza(PizzaTypeAF.CLAM)
    println("D 주문 피자: $pizzaAF")
}