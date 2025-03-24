package claseRepaso.coche

import kotlin.math.abs

open class Neumatico(
    val presionMaxRecomendada: Int,
    val presionMinRecomendada: Int,
    var kmMaximosDeRodaje: Int
) {

    var pinchado: Boolean = false
    var presion: Int = presionMaxRecomendada
    var kmRodados: Int = 0

    fun getPresionRecomendada(): Int = presionMaxRecomendada

    fun inflar(incremento: Int) {
        if (!pinchado) {
            presion += incremento

            if (presion > presionMaxRecomendada)
                presion = presionMaxRecomendada
        }
    }

    fun pierdePresion(decremento: Int) {
        if (!pinchado) {
            presion -= abs(decremento)

            if (presion < 0)
                presion = 0
        }
    }

    fun pinchar() {
        presion = 0
        pinchado = true
    }

    fun recorrer(km: Int) {
        if (km > 0)
            kmRodados += km
    }

    fun estaDesgastado() = presion > kmMaximosDeRodaje

    fun estaDeshinchado() = presion < presionMinRecomendada

    override fun toString(): String {
        return "Neumatico(presionMaxRecomendada=$presionMaxRecomendada," +
                " presionMinRecomendada=$presionMinRecomendada," +
                " kmMaximosDeRodaje=$kmMaximosDeRodaje," +
                " pinchado=$pinchado," +
                " presion=$presion," +
                " kmRodados=$kmRodados)"
    }
}
