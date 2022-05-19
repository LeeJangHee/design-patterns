package main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.tomato

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.Tomato

class NYTomato : Tomato {
    override fun toString(): String {
        return "## 뉴욕 토마토 ##"
    }
}