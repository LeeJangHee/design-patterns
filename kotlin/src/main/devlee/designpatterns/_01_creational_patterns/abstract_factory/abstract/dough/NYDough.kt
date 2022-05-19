package main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.dough

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.Dough

class NYDough : Dough {
    override fun toString(): String {
        return "## 뉴욕 도우 ##"
    }
}