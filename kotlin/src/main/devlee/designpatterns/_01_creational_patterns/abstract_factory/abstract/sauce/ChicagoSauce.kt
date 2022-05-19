package main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.sauce

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.Sauce

class ChicagoSauce : Sauce {
    override fun toString(): String {
        return "## 시카고 소스 ##"
    }
}