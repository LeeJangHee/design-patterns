package main.devlee.designpatterns._02_structural_patterns.composite

class M16 : Component {
    override fun getWeight(): Int {
        return 3500
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun getItemName(): String {
        return "M-16"
    }
}