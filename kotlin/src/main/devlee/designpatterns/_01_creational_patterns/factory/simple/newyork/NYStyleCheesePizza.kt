package main.devlee.designpatterns._01_creational_patterns.factory.simple.newyork

import main.devlee.designpatterns._01_creational_patterns.factory.simple.Pizza

class NYStyleCheesePizza : Pizza() {
    init {
        name = "NY 치즈 피자"
        dough = "치즈 도우"
        sauce = "치즈 소스"
    }
}