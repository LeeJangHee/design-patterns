package main.devlee.designpatterns._01_creational_patterns.factory.simple

abstract class Pizza {

    var name: String = ""
    var dough: String = ""
    var sauce: String = ""

    override fun toString(): String {
        return """
            { name : $name, dough : $dough, sauce : $sauce }
        """.trimIndent()
    }

    fun prepare() {
        println("Prepare $name")
        println("도우 셋팅 중...")
        println("소스 추가 중...")
        println("토핑 추가 중: ")
    }

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
