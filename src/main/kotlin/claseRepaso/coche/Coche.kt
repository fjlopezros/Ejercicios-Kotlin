package claseRepaso.coche

class Coche(
    presionMaxRecomendada: Int,
    presionMinRecomendada: Int,
    kmMaximosDeRodaje: Int,
    val marca: String,
    val modelo: String,
    val color: String,
    litrosRepostados: Double,
    val litrosMax: Double,
    val caballos: Int,
    val kmRevision: Int
) :
    Neumatico(
        presionMaxRecomendada,
        presionMinRecomendada,
        kmMaximosDeRodaje
    ) {

    var _litrosRepostados = litrosRepostados
        get() = field

    var kmRecorridos: Int = 0

    var listaRuedas: List<Neumatico> = listOf(
        Neumatico(presionMaxRecomendada, presionMinRecomendada, kmMaximosDeRodaje),
        Neumatico(presionMaxRecomendada, presionMinRecomendada, kmMaximosDeRodaje),
        Neumatico(presionMaxRecomendada, presionMinRecomendada, kmMaximosDeRodaje),
        Neumatico(presionMaxRecomendada, presionMinRecomendada, kmMaximosDeRodaje)
    )

    var ruedaDelanteraDerecha: Neumatico = listaRuedas[0]
    var ruedaDelanteraIzquierda: Neumatico = listaRuedas[1]
    var ruedaTraseraDerecha: Neumatico = listaRuedas[2]
    var ruedaTraseraIzquierda: Neumatico = listaRuedas[3]

    fun repostar(litros: Double) {
        if (litros > 0) {
            _litrosRepostados += litros

            if (_litrosRepostados > litrosMax) {
                _litrosRepostados = litrosMax
            }
        }
    }

    fun recorrerCoche(km: Int) {
        var op: Int = 12
        var const: Int = 12

        var litrosRestantes = km / const

        if (litrosRestantes <= _litrosRepostados) {
            if (_litrosRepostados > 0) {
                kmRecorridos += km

                ruedaDelanteraDerecha.kmRodados += km
                ruedaDelanteraIzquierda.kmRodados += km
                ruedaTraseraDerecha.kmRodados += km
                ruedaTraseraIzquierda.kmRodados += km

                for (i in 0..km) {
                    if (i == op) {
                        if (_litrosRepostados > 0) {
                            _litrosRepostados -= 1
                        }
                        op += const
                    }
                }
            }
        }
    }

    fun necesitaRevision() = kmRecorridos > kmRevision

    fun getPrueba(rueda: Int): Neumatico? {
        when (rueda) {
            1 -> return ruedaDelanteraIzquierda
            2 -> return ruedaDelanteraDerecha
            3 -> return ruedaTraseraIzquierda
            4 -> return ruedaTraseraDerecha
        }
        return null
    }

    override fun toString(): String {
        return "Coche(marca='$marca'," +
                " modelo='$modelo'," +
                " color='$color'," +
                " litrosRepostados=$_litrosRepostados," +
                " litrosMax=$litrosMax," +
                " caballos=$caballos," +
                " kmRevision=$kmRevision," +
                " kmRecorridos=$kmRecorridos," +
                " listaRuedas=$listaRuedas)"
    }
}