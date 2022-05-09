package main.devlee.designpatterns._01_creational_patterns._02_factory.simple.chicago

import main.devlee.designpatterns._01_creational_patterns._02_factory.simple.Pizza

class ChicagoStyleVeggiePizza: Pizza() {
    init {
        name = "시카고 야채 피자"
        dough = "두꺼운 야채 도우"
        sauce = "체다 치즈 야채 소스"
    }
}