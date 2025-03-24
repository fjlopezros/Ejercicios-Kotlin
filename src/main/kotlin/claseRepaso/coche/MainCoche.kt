package claseRepaso.coche

fun main() {
    var c1: Coche = Coche(
        50,
        20,
        100,
        "Seat",
        "LIbiza",
        "Amarillo",
        60.0,
        100.0,
        125,
        450
    )

    var c2: Coche = Coche(
        50,
        20,
        100,
        "Seat",
        "Leon",
        "Negro",
        60.0,
        100.0,
        125,
        450
    )


    c1.recorrerCoche(20)
    c2.recorrerCoche(30)

    println(c1.kmRecorridos)
    println(c1._litrosRepostados)

    println(c2.kmRecorridos)
    println(c2._litrosRepostados)

    println("-----------------------")

    c1.recorrerCoche(20)
    c2.recorrerCoche(1000)

    println(c1.kmRecorridos)
    println(c1._litrosRepostados)

    println(c2.kmRecorridos)
    println(c2._litrosRepostados)
    println("-----------------------")

    c2.repostar(50.0)
    c2.recorrerCoche(12)
    println(c2.kmRecorridos)
    println(c2._litrosRepostados)

    println("-----------------------")


    println("Revision? ${c1.necesitaRevision()}")
    println("Revision? ${c2.necesitaRevision()}")

    println("-----------------------")

    c1.ruedaTraseraDerecha.pinchar()
    println(c1)

    println("-----------------------")


    c2.ruedaDelanteraIzquierda.pierdePresion(1000)
    println(c2)

}