package main.devlee.designpatterns._03_behavioal_patterns.observer

class CurrentConditionsDisplay(
    weatherData: WeatherData
) : Observer, DisplayElement {
    private var temperature: Float = 0f
    private var humidity: Float = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        println("[CurrentConditionsDisplay] 현재 상태: $temperature 도 $humidity %")
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }


}