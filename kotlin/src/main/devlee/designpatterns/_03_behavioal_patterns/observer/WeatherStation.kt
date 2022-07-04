package main.devlee.designpatterns._03_behavioal_patterns.observer


fun main() {
    val weatherData: WeatherData = WeatherData()

    val currentDisplay = CurrentConditionsDisplay(weatherData)
    val statisticsDisplay = StatisticsDisplay(weatherData)
    val forecastDisplay = ForecastDisplay(weatherData)

    weatherData.setMeasurements(85f, 65f, 30.4f)
    weatherData.setMeasurements(82f, 70f, 29.2f)
    weatherData.setMeasurements(78f, 90f, 29.2f)

    weatherData.removeObserver(forecastDisplay)
    weatherData.setMeasurements(62f, 90f, 28.1f)
}