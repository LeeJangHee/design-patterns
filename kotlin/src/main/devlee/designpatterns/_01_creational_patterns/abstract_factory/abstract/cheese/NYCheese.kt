package main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.cheese

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.Cheese

class NYCheese : Cheese {
    override fun toString(): String {
        return "## 뉴욕 치즈 ##"
    }
}