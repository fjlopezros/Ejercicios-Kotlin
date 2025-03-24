package claseRepaso.POO

fun main() {
    var pikachu = Pokemon()
    println(pikachu)

    var charmander = Pokemon("Charmander", "Fuego", 100, 30, 15)
    println(charmander)

    var squirtle = Pokemon("Squirtle", "Agua")
    println(squirtle)

    var newton = PokemonLegendario("newton", "Legendario", 500, 180, 75, "Lluvia")
    println(newton)
}