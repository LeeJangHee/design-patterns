package main.devlee.designpatterns._02_structural_patterns.composite

class Bullet_7(val count: Int): Component {
    override fun getWeight(): Int {
        return 7 * getItemCount()
    }

    override fun getItemCount(): Int {
        return count
    }

    override fun getItemName(): String {
        return "7.62mm"
    }
}