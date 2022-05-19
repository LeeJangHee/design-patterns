package main.devlee.designpatterns._01_creational_patterns.factory.simple

import main.devlee.designpatterns._01_creational_patterns.factory.simple.chicago.ChicagoPizzaStore
import main.devlee.designpatterns._01_creational_patterns.factory.simple.newyork.NYPizzaStore


fun main() {
    val nyStore = NYPizzaStore()
    val chicagoStore = ChicagoPizzaStore()

    val pizza: Pizza = nyStore.orderPizza(PizzaType.CHEESE)
    println("철수 주문 : ${pizza.name}, \n$pizza")

    print("\n\n")

    val chicagoTomatoPizza: Pizza = chicagoStore.orderPizza(PizzaType.TOMATO)
    println("영희 주문 : ${chicagoTomatoPizza.name}, \n$chicagoTomatoPizza")
}