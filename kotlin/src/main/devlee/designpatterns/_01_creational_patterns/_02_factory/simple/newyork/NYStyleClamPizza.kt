package main.devlee.designpatterns._01_creational_patterns._02_factory.simple.newyork

import main.devlee.designpatterns._01_creational_patterns._02_factory.simple.Pizza

class NYStyleClamPizza : Pizza() {
    init {
        name = "NY 조개 피자"
        dough = "조개 도우"
        sauce = "키조개 소스"
    }
}