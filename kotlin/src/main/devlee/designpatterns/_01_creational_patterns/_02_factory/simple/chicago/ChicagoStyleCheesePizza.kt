package main.devlee.designpatterns._01_creational_patterns._02_factory.simple.chicago

import main.devlee.designpatterns._01_creational_patterns._02_factory.simple.Pizza

class ChicagoStyleCheesePizza: Pizza() {
    init {
        name = "시카고 치즈 피자"
        dough = "두꺼운 도우"
        sauce = "체다 치즈 소스"
    }
}