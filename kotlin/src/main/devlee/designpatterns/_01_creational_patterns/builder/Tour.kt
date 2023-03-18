package main.devlee.designpatterns._01_creational_patterns.builder

import java.time.LocalDate

data class Tour(
    val name: String,
    val startDate: LocalDate,
    val nights: Int,
    val days: Int,
    val whereToStay: String,
    val detailPlans: List<DetailPlan>
) {
    override fun toString(): String {
        val sb = StringBuffer()
        sb.appendLine("====  $name  ====")
            .appendLine("date: $startDate")
            .appendLine("$nights 박 $days 일")
            .appendLine("stay: $whereToStay")
            .appendLine("plan")
            .appendLine(detailPlans.makeToString())
        return sb.toString()
    }

    private fun List<DetailPlan>.makeToString(): String {
        val sb = StringBuilder()
        this.forEach {
            sb.append(it)
                .append("\n")
        }
        if (this.isEmpty()) sb.append("There are no detailed plans.")
        return sb.toString()
    }
}
