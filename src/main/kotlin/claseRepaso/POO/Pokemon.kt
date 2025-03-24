package claseRepaso.POO

//Clase Prueba
//atributos
open class Pokemon(
    var nombre: String? = null,
    var tipo: String? = null,
    var vida: Int = 0,
    var poderAtaque: Int = 0,
    var poderDefensa: Int = 0
) {

    override fun toString(): String = "-----------------\n" +
            "Nombre: ${nombre}\n" +
            "Tipo: ${tipo}\n" +
            "Vida: ${vida}\n" +
            "Ataque: ${poderAtaque}\n" +
            "Defensa: ${poderDefensa}\n"

}