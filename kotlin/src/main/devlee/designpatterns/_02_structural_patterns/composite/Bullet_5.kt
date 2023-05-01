package main.devlee.designpatterns._02_structural_patterns.composite

class Bullet_5(private val count: Int) : Component {
    override fun getWeight(): Int {
        return 5 * getItemCount()
    }

    override fun getItemCount(): Int {
        return count
    }

    override fun getItemName(): String {
        return "5.56mm"
    }
}