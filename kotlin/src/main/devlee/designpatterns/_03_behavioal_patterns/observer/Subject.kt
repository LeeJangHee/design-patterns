package main.devlee.designpatterns._03_behavioal_patterns.observer

interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObservers()
}