package main.devlee.designpatterns._01_creational_patterns.builder

import java.time.LocalDate

class DefaultTourBuilder : TourPlanBuilder {

    private var name: String = "Default Tour"
    private var startDate: LocalDate = LocalDate.now()
    private var nights: Int = 0
    private var days: Int = 1
    private var whereToStay: String = "Hotel"
    private val detailPlans: MutableList<DetailPlan> = mutableListOf()
    override fun nightsAndDays(nights: Int, days: Int): TourPlanBuilder = apply {
        this.nights = nights
        this.days = days
    }

    override fun title(title: String): TourPlanBuilder = apply {
        this.name = title
    }

    override fun startDate(startDate: LocalDate): TourPlanBuilder = apply {
        this.startDate = startDate
    }

    override fun whereToStay(whereToStay: String): TourPlanBuilder = apply {
        this.whereToStay = whereToStay
    }

    override fun addPlan(no: Int, plan: String): TourPlanBuilder = apply {
        this.detailPlans.add(DetailPlan(no, plan))
    }

    override fun removePlan(plan: DetailPlan): TourPlanBuilder = apply {
        if (this.detailPlans.contains(plan)) {
            this.detailPlans.remove(plan)
        }
    }

    override fun build(): Tour {
        println("Create Default Tour !!")
        return Tour(name, startDate, nights, days, whereToStay, detailPlans)
    }

}