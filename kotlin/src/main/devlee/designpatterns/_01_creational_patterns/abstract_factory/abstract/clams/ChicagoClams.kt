package main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.clams

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.Clams

class ChicagoClams : Clams {
    override fun toString(): String {
        return "## 시카고 조개 ##"
    }
}