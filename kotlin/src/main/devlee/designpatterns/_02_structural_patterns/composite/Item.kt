package main.devlee.designpatterns._02_structural_patterns.composite

data class Item(
    val name: String,
    val price: Int
) : Component {

    override fun getPriceKt(): Int {
        return this.price
    }

}
