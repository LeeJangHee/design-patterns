package main.devlee.designpatterns._02_structural_patterns.decorator

abstract class CondimentDecorator : Beverage {
    abstract val beverage: Beverage
}