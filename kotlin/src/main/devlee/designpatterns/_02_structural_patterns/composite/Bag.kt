package main.devlee.designpatterns._02_structural_patterns.composite

class Bag : Component {
    val components: ArrayList<Component> = arrayListOf()

    fun add(component: Component) {
        this.components.add(component)
    }

    override fun getPriceKt(): Int {
        return components.sumOf { it.getPriceKt() }
    }

}
