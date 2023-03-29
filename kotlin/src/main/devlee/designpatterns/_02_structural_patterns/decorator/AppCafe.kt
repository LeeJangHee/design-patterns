package main.devlee.designpatterns._02_structural_patterns.decorator

class AppCafe {
    init {
        val bw = System.out.bufferedWriter()
        var beverage1: Beverage = Decaf()
        bw.appendLine("1번 커피 주문")
        bw.appendLine("${beverage1.getDescription()} $${beverage1.cost()}")

        var beverage2: Beverage = HouseBlend()
        beverage2 = Mocha(beverage2)
        beverage2 = Mocha(beverage2)
        beverage2 = Whip(beverage2)
        bw.appendLine("2번 커피 주문")
        bw.appendLine("${beverage2.getDescription()} $${beverage2.cost()}")

        var beverage3: Beverage = Espresso()
        beverage3 = Milk(beverage3)
        beverage3 = Soy(beverage3)
        beverage3 = Mocha(beverage3)
        bw.appendLine("3번 커피 주문")
        bw.appendLine("${beverage3.getDescription()} $${beverage3.cost()}")


        bw.flush()
    }
}

private fun main() {
    AppCafe()
}