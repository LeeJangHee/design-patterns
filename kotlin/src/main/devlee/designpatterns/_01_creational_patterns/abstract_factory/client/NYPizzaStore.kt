package main.devlee.designpatterns._01_creational_patterns.abstract_factory.client

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.PizzaAF
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.PizzaStoreAF
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.PizzaTypeAF
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.factory.NYPizzaIngredientFactory
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.pizza.CheesePizza
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.pizza.ClamsPizza
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.pizza.TomatoPizza
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.pizza.VeggiePizza

class NYPizzaStore : PizzaStoreAF() {

    override fun createPizza(item: PizzaTypeAF): PizzaAF {
        val ingredientFactory = NYPizzaIngredientFactory()

        return when(item) {
            PizzaTypeAF.CHEESE -> {
                CheesePizza(ingredientFactory).apply {
                    name = "뉴욕 치즈 피자"
                }
            }
            PizzaTypeAF.CLAM -> {
                ClamsPizza(ingredientFactory).apply {
                    name = "뉴욕 조개 피자"
                }
            }
            PizzaTypeAF.TOMATO -> {
                TomatoPizza(ingredientFactory).apply {
                    name = "뉴욕 토마토 피자"
                }
            }
            PizzaTypeAF.VEGGIE -> {
                VeggiePizza(ingredientFactory).apply {
                    name = "뉴욕 야채 피자"
                }
            }
        }
    }
}