package main.devlee.designpatterns._03_behavioal_patterns.observer

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}