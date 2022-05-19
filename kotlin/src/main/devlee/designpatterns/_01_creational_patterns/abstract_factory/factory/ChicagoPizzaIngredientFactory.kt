package main.devlee.designpatterns._01_creational_patterns.abstract_factory.factory

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.*
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.cheese.ChicagoCheese
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.clams.ChicagoClams
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.dough.ChicagoDough
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.sauce.ChicagoSauce
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.tomato.ChicagoTomato
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.veggies.ChicagoVeggie

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough = ChicagoDough()

    override fun createSauce(): Sauce =ChicagoSauce()

    override fun createCheese(): Cheese = ChicagoCheese()

    override fun createVeggie(): Veggie = ChicagoVeggie()

    override fun createClams(): Clams = ChicagoClams()

    override fun createTomato(): Tomato = ChicagoTomato()

}