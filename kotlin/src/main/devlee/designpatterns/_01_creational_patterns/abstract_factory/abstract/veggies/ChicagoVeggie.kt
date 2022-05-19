package main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.veggies

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.Veggie

class ChicagoVeggie : Veggie {
    override fun toString(): String {
        return "## 시카고 야채 ##"
    }
}