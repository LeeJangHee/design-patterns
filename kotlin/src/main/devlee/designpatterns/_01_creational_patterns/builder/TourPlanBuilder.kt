package main.devlee.designpatterns._01_creational_patterns.builder

import java.time.LocalDate

interface TourPlanBuilder {

    fun nightsAndDays(nights: Int, days: Int): TourPlanBuilder

    fun title(title: String): TourPlanBuilder

    fun startDate(startDate: LocalDate): TourPlanBuilder

    fun whereToStay(whereToStay: String): TourPlanBuilder

    fun addPlan(no: Int, plan: String): TourPlanBuilder

    fun removePlan(plan: DetailPlan): TourPlanBuilder

    fun build(): Tour
}