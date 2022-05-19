package main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.cheese

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.Cheese

class ChicagoCheese : Cheese {
    override fun toString(): String {
        return "## 시카고 치즈 ##"
    }
}