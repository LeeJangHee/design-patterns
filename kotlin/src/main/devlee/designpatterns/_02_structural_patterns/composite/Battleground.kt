package main.devlee.designpatterns._02_structural_patterns.composite

class Battleground {

    init {
        val level3Bag  = BattlegroundBag("3레벨 가방")
        val m4 = M4A1()
        val Kar98 = Kar98()
        val bullet5 = Bullet_5(120)
        val bullet7 = Bullet_7(30)

        level3Bag.addItem(m4)
        level3Bag.addItem(Kar98)
        level3Bag.addItem(bullet5)
        level3Bag.addItem(bullet7)

        println(level3Bag.getItemName())
        println("가방의 총 무게 : " + level3Bag.getWeight() + "g")
        println("아이템 리스트 : " + level3Bag.hasItemList())
        println("총알 개수")
        println("5탄 : ${bullet5.getItemCount()}, 7탄 : ${bullet7.getItemCount()}")
    }
}

private fun main() {
    Battleground()
}