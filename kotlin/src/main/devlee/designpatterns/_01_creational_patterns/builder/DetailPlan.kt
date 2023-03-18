package main.devlee.designpatterns._01_creational_patterns.builder

data class DetailPlan(
    val no: Int,
    val plan: String
) {
    override fun toString(): String {
        return "$no - $plan"
    }
}
