package claseRepaso.peso

class Peso(private var peso: Double, private var unidad: String) {

    fun getLibras(): Double = when (unidad.lowercase()) {
        "gramos" -> peso / 1000 * 2.20462
        "kilos" -> peso * 2.20462
        "libras" -> peso
        else -> throw IllegalArgumentException("Unidad no soportada")
    }

    fun getOnzas(): Double = when (unidad.lowercase()) {
        "gramos" -> peso / 1000 * 35.274
        "kilos" -> peso * 35.274
        "libras" -> peso * 16
        else -> throw IllegalArgumentException("Unidad no soportada")
    }

    fun getKilos(): Double = when (unidad.lowercase()) {
        "gramos" -> peso / 1000
        "kilos" -> peso
        "libras" -> peso / 2.20462
        else -> throw IllegalArgumentException("Unidad no soportada")
    }

    fun getMostrarPeso(): String = "$peso $unidad"
}

fun main() {
    val peso = Peso(100.0, "gramos")

    println("Peso en libras: ${peso.getLibras()}")
    println("Peso en onzas: ${peso.getOnzas()}")
    println("Peso en kilos: ${peso.getKilos()}")
    println("Mostrar peso: ${peso.getMostrarPeso()}")
}
