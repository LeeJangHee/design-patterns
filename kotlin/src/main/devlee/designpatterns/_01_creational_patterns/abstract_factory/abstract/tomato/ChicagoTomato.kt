package main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.tomato

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.Tomato

class ChicagoTomato : Tomato {
    override fun toString(): String {
        return "## 시카고 토마토 ##"
    }
}