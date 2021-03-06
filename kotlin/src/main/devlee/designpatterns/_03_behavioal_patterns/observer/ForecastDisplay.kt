package main.devlee.designpatterns._03_behavioal_patterns.observer

class ForecastDisplay(private val weatherData: WeatherData) : Observer, DisplayElement{
    private var currentPressure = 29.92f
    private var lastPressure: Float = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        println("Forecast: ")
        if (currentPressure > lastPressure) {
            println("Improving weather on the way!")
        } else if (currentPressure == lastPressure) {
            println("More of the same")
        } else if (currentPressure < lastPressure) {
            println("Watch out for cooler, rainy weather")
        }
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        lastPressure = currentPressure
        currentPressure = pressure
        display()
    }
}