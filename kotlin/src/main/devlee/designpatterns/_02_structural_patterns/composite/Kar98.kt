package main.devlee.designpatterns._02_structural_patterns.composite

class Kar98 : Component {
    override fun getWeight(): Int {
        return 5000
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun getItemName(): String {
        return "Kar-98"
    }
}