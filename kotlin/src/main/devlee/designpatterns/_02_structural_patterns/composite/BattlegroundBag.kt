package main.devlee.designpatterns._02_structural_patterns.composite

class BattlegroundBag(
    private val name: String
) : Component {
    private val _components: ArrayList<Component> = arrayListOf()

    fun addItem(component: Component) {
        _components.add(component)
    }

    fun hasItemList(): String {
        val iter = _components.iterator()
        val sb = StringBuilder()
        while (iter.hasNext()) {
            sb.append(iter.next().getItemName())
                .append(", ")
        }
        sb.delete(sb.lastIndex - 1, sb.lastIndex)
        return sb.toString()
    }

    override fun getWeight(): Int {
        return _components.sumOf { it.getWeight() }
    }

    override fun getItemCount(): Int {
        return _components.sumOf { it.getItemCount() }
    }

    override fun getItemName(): String {
        return name
    }
}