package claseRepaso.finanzas

class Finanzas(var dolaresActual: Double = 1.07) {

}

fun main() {
    val calculoEuros: Double = 1.06
    val calculoDolares: Double = 0.95

    val dolares = 100.0
    val euros = 100.0

    val finanzasValor: Finanzas = Finanzas()
    val finanzasElegidas: Finanzas = Finanzas(calculoEuros)

    println("Constructor parametrizado vacio: ${finanzasValor.dolaresActual}")
    println("Constructor parametrizado unico parametro: ${finanzasElegidas.dolaresActual}")

    println("Dólares a Euros: ${dolaresToEuros(dolares, calculoEuros)}")
    println("Euros a Dólares: ${eurosToDolares(euros, calculoDolares)}")
}

fun dolaresToEuros(dolares: Double, calculoEuros: Double): Double {
    return dolares * calculoEuros
}

fun eurosToDolares(euros: Double, calculoDolares: Double): Double {
    return euros * calculoDolares
}
