package main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.veggies

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.Veggie

class NYVeggie : Veggie {
    override fun toString(): String {
        return "## 뉴욕 야채 ##"
    }
}