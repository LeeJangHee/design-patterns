package main.devlee.designpatterns._02_structural_patterns.bridge

import kotlin.jvm.Throws

class TVFactory {
    @Throws
    fun getTV(type: String): TV {
        return when {
            type == "LG" -> LG()
            type == "Samsung" -> Samsung()
            type == "Sony" -> Sony()
            else -> throw Exception("Invalid TV Type")
        }
    }
}