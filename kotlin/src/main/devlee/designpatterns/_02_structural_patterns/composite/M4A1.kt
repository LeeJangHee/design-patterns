package main.devlee.designpatterns._02_structural_patterns.composite

class M4A1: Component {
    override fun getWeight(): Int {
        return 3800
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun getItemName(): String {
        return "M4A1"
    }
}