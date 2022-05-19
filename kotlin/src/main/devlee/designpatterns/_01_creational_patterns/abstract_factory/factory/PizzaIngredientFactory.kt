package main.devlee.designpatterns._01_creational_patterns.abstract_factory.factory

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.*

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggie(): Veggie
    fun createClams(): Clams
    fun createTomato(): Tomato
}