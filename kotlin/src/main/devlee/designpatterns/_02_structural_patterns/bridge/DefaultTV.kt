package main.devlee.designpatterns._02_structural_patterns.bridge

abstract class DefaultTV(
    val type: String
) : TV {

    override fun on() {
        println("Turning on the $type TV.")
    }

    override fun off() {
        println("Turning off the $type TV.")
    }

}