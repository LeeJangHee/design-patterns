package main.devlee.designpatterns._01_creational_patterns._02_factory.simple

import main.devlee.designpatterns._01_creational_patterns._02_factory.simple.chicago.ChicagoPizzaStore
import main.devlee.designpatterns._01_creational_patterns._02_factory.simple.newyork.NYPizzaStore


fun main() {
    val nyStore = NYPizzaStore()
    val chicagoStore = ChicagoPizzaStore()

    val pizza: Pizza = nyStore.orderPizza(PizzaType.CHEESE)
    println("철수 주문 : ${pizza.name}")
}