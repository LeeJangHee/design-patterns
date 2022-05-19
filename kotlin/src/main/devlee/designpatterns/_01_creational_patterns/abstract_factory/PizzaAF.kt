package main.devlee.designpatterns._01_creational_patterns.abstract_factory

import main.devlee.designpatterns._01_creational_patterns.abstract_factory.`interface`.*

abstract class PizzaAF {

    var name: String = ""

    var dough: Dough? = null
    var sauce: Sauce? = null
    var cheese: Cheese? = null
    var clams: Clams? = null
    var veggie: Veggie? = null
    var tomato: Tomato? = null

    override fun toString(): String {
        val result = StringBuffer()
        result.append("--- $name ---\n")
        dough?.let {
            result.append(it)
            result.append("\n")
        }

        sauce?.let {
            result.append(it)
            result.append("\n")
        }

        cheese?.let {
            result.append(it)
            result.append("\n")
        }

        clams?.let {
            result.append(it)
            result.append("\n")
        }

        veggie?.let {
            result.append(it)
            result.append("\n")
        }

        tomato?.let {
            result.append(it)
            result.append("\n")
        }

        return result.toString()
    }

    abstract fun prepare()

    fun bake() {
        println("25분 동안 피자를 굽습니다.")
    }

    fun cut() {
        println("피자를 8등분으로 자릅니다.")
    }

    fun box() {
        println("피자 박스에 피자를 담고 있습니다.")
    }
}
