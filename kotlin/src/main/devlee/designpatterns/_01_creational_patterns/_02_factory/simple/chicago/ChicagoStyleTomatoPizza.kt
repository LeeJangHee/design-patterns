package main.devlee.designpatterns._01_creational_patterns._02_factory.simple.chicago

import main.devlee.designpatterns._01_creational_patterns._02_factory.simple.Pizza

class ChicagoStyleTomatoPizza: Pizza() {
    init {
        name = "시카고 토마토 피자"
        dough = "두꺼운 토마토 도우"
        sauce = "체다 치즈 토마토 소스"
    }
}