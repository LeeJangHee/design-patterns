package main.devlee.designpatterns._01_creational_patterns.factory.simple.newyork

import main.devlee.designpatterns._01_creational_patterns.factory.simple.Pizza

class NYStyleTomatoPizza : Pizza() {
    init {
        name = "NY 토마토 피자"
        dough = "토마토 도우"
        sauce = "리얼 토마토 소스"
    }
}