package claseRepaso.likeJava

//Plenamente Didactico
class Animal(private var edad: Int = 0) {

    var nombre: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }


}

fun main() {
    var perro = Animal()
    perro.nombre = "Anselmo"
    print(perro.nombre)
}