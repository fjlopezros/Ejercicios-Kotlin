package claseRepaso.temperatura

fun main() {
    val celsius: Double = 35.4
    val fahrenheit: Double = 40.7

    println("Conversion de Celsius a Fahrenheit: ${convertCelsiusToFahrenheit(celsius)}")
    println("Conversion de Fahrenheit a Celsius: ${convertFahrenheitToCelsius(fahrenheit)}")
}

fun convertCelsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}

fun convertFahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}
