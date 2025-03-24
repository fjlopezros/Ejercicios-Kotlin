package claseRepaso.POO

class PokemonLegendario(
    nombre: String? = null,
    tipo: String? = null,
    vida: Int = 0,
    poderAtaque: Int = 0,
    poderDefensa: Int = 0,
    var poderSecreto: String? = null
) :
    Pokemon(
        nombre,
        tipo,
        vida,
        poderAtaque,
        poderDefensa
    ) {

    override fun toString(): String = super.toString() +
            "poderSecreto: ${poderSecreto}"
}