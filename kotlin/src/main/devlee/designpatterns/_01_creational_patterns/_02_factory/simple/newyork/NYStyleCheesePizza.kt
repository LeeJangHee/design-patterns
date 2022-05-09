package main.devlee.designpatterns._01_creational_patterns._02_factory.simple.newyork

import main.devlee.designpatterns._01_creational_patterns._02_factory.simple.Pizza

class NYStyleCheesePizza : Pizza() {
    init {
        name = "NY 치즈 피자"
        dough = "크러스트 도우"
        sauce = "토마토 피자 소스"
    }
}