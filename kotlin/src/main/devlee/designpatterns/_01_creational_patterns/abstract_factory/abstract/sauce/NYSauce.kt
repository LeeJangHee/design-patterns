package main.devlee.designpatterns._01_creational_patterns.abstract_factory.abstract.sauce

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.Sauce

class NYSauce : Sauce {
    override fun toString(): String {
        return "## 뉴욕 소스 ##"
    }
}