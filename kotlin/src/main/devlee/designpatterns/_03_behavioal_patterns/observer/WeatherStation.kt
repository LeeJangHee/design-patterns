package main.devlee.designpatterns._03_behavioal_patterns.observer


fun main() {
    val weatherData: WeatherData = WeatherData()

    val currentDisplay = CurrentConditionsDisplay(weatherData)
    val statisticsDisplay = StatisticsDisplay(weatherData)
    val forecastDisplay = ForecastDisplay(weatherData)

    println("첫 번째 데이터")
    weatherData.setMeasurements(85f, 65f, 30.4f)
    println("두 번째 데이터")
    weatherData.setMeasurements(82f, 70f, 29.2f)
    println("세 번째 데이터")
    weatherData.setMeasurements(78f, 90f, 29.2f)


    weatherData.removeObserver(forecastDisplay)
    println("\nForecastDisplay 구독 취소 후 데이터")
    weatherData.setMeasurements(62f, 90f, 28.1f)
}