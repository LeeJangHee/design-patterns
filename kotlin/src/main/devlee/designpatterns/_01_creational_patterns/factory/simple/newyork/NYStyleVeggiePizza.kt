package main.devlee.designpatterns._01_creational_patterns.factory.simple.newyork

import main.devlee.designpatterns._01_creational_patterns.factory.simple.Pizza

class NYStyleVeggiePizza : Pizza() {
    init {
        name = "NY 야채 피자"
        dough = "야채 도우"
        sauce = "하루 야채 소스"
    }
}