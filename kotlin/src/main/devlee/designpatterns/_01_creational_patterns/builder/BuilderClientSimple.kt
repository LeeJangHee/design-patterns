package main.devlee.designpatterns._01_creational_patterns.builder

import java.time.LocalDate

class BuilderClientSimple {
    init {
        val defaultTourBuilder = DefaultTourBuilder()
        val tour = defaultTourBuilder
            .title("JangHee Tour")
            .nightsAndDays(2, 3)
            .startDate(LocalDate.of(2023, 3, 13))
            .whereToStay("근사한 호텔")
            .addPlan(1, "비행기 타기")
            .addPlan(2, "바다 보기")
            .addPlan(3, "맛있는 저녁 먹기")
            .build()

        println(tour)

        val simpleTour = DefaultTourBuilder()
            .title("Simple Tour")
            .startDate(LocalDate.of(2023, 5, 5))
            .build()
        println(simpleTour)
    }
}

private fun main() {
    BuilderClientSimple()
}