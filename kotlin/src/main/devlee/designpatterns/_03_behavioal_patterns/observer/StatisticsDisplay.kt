package main.devlee.designpatterns._03_behavioal_patterns.observer

class StatisticsDisplay(
    weatherData: WeatherData
) : Observer, DisplayElement {
    private var maxTemp = Float.MIN_VALUE
    private var minTemp = Float.MAX_VALUE
    private var tempSum = 0f
    private var numReadings = 0

    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        println(
            "[StatisticsDisplay] Avg/Max/Min temperature = " + tempSum / numReadings
                    + "/" + maxTemp + "/" + minTemp
        )
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        tempSum += temp
        numReadings++

        if (temp > maxTemp) {
            maxTemp = temp
        }

        if (temp < minTemp) {
            minTemp = temp
        }

        display()
    }
}