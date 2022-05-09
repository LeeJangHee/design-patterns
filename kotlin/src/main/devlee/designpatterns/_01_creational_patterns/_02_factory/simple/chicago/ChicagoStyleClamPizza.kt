package main.devlee.designpatterns._01_creational_patterns._02_factory.simple.chicago

import main.devlee.designpatterns._01_creational_patterns._02_factory.simple.Pizza

class ChicagoStyleClamPizza: Pizza() {
    init {
        name = "시카고 조개 피자"
        dough = "두꺼운 조개 도우"
        sauce = "체다 치즈 조개 소스"
    }
}