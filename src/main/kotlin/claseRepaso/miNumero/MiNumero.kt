package claseRepaso.miNumero

class MiNumero(var numero: Int = 0) {

    fun cambiaNumero(numeroCambiado: Int) {
        numero = numeroCambiado
    }

    fun suma(numeroSuma: Int) {
        numero += numeroSuma
    }

    fun resta(numeroResta: Int) {
        if (numero >= numeroResta) numero -= numeroResta
        else numero = numeroResta - numero
    }

    fun getValor() = println(numero)

    fun getDouble() = numero * 2

    fun getTriple() = numero * 3

    fun getCuadruple() = numero * 4
}

fun main() {
    val miNumeroVacio: MiNumero = MiNumero()
    val miNumeroValor: MiNumero = MiNumero(5)

    miNumeroValor.cambiaNumero(10)

    miNumeroVacio.getValor()
    miNumeroValor.getValor()

    miNumeroValor.suma(5)
    miNumeroValor.getValor()

    miNumeroValor.resta(5)
    miNumeroValor.getValor()

    miNumeroValor.getDouble()
    miNumeroValor.getValor()

    miNumeroValor.getTriple()
    miNumeroValor.getValor()

    miNumeroValor.getCuadruple()
    miNumeroValor.getValor()
}
