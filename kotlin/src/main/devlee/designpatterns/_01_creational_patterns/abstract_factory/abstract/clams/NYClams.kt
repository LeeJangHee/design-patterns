package main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.clams

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.Clams

class NYClams : Clams {
    override fun toString(): String {
        return "## 뉴욕 조개 ##"
    }
}