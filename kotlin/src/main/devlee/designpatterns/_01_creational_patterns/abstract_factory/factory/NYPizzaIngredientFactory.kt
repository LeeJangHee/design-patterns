package main.devlee.designpatterns._01_creational_patterns.abstract_factory.factory

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.*
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.cheese.NYCheese
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.clams.NYClams
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.dough.NYDough
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.sauce.NYSauce
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.tomato.NYTomato
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.veggies.NYVeggie

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough = NYDough()

    override fun createSauce(): Sauce = NYSauce()

    override fun createCheese(): Cheese = NYCheese()

    override fun createVeggie(): Veggie = NYVeggie()

    override fun createClams(): Clams = NYClams()

    override fun createTomato(): Tomato = NYTomato()
}