package main.devlee.designpatterns._01_creational_patterns.abstract_factory.client

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.PizzaAF
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.PizzaStoreAF
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.PizzaTypeAF
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.factory.ChicagoPizzaIngredientFactory
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.pizza.CheesePizza
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.pizza.ClamsPizza
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.pizza.TomatoPizza
import main.devlee.designpatterns._01_creational_patterns.abstract_factory.pizza.VeggiePizza

class ChicagoPizzaStore : PizzaStoreAF() {
    override fun createPizza(item: PizzaTypeAF): PizzaAF {
        val ingredientFactory = ChicagoPizzaIngredientFactory()

        return when(item) {
            PizzaTypeAF.CHEESE -> {
                CheesePizza(ingredientFactory).apply {
                    name = "시카고 치즈 피자"
                }
            }
            PizzaTypeAF.CLAM -> {
                ClamsPizza(ingredientFactory).apply {
                    name = "시카고 조개 피자"
                }
            }
            PizzaTypeAF.TOMATO -> {
                TomatoPizza(ingredientFactory).apply {
                    name = "시카고 토마토 피자"
                }
            }
            PizzaTypeAF.VEGGIE -> {
                VeggiePizza(ingredientFactory).apply {
                    name = "시카고 야채 피자"
                }
            }
        }
    }
}