package claseRepaso.carritoDeLaCompra

enum class Productos(
    val nombre: String,
    val descripcion: String,
    val precio: Double,
    val descuento: Double?
) {
    BICI00("Bicicleta", "Bicicleta de montaña con marchas", 350.0, 15.0),
    BICI01("Bicicleta BMX", "Bicicleta acertada para ir por la calle haciendo trucos", 199.0, 0.0),
    MESA00("Mesa", "Mesa ideal comedor madera de abedul", 100.0, 5.0),
    MESA01("Escritorio", "Escritorio para estudiante con corpantimentos", 250.0, 25.0),
    TV00("Television SmartTV", "Television de 55", 300.0, 0.0),
    TV01("Monitor", "Monitor para PC 27 QLED 144Hz", 400.0, .0);
}

class carritoDeLaCompra() {
    val productosCarrito = mutableMapOf<Productos, Int>()

    fun mostrarCarrito() {
        if (productosCarrito.isEmpty()) {
            println("El carrito esta vacio")
        } else {
            println("Productos del Carrito: ")
            for ((producto, cantidad) in productosCarrito) {
                println("Producto: ${producto.nombre}, Cantidad: ${cantidad}")
            }
        }
    }

    fun addProducto(productos: Productos) {
        if (productosCarrito.containsKey(productos)) {
            val cantidad = productosCarrito[productos] ?: 0 //Operador Elvis, manejo de null
            productosCarrito.put(productos, cantidad + 1)
            //productosCarrito[productos] = cantidad + 1
        } else {
            productosCarrito.put(productos, 1)
            //productosCarrito[productos] = 1
        }
    }

    fun addProductos(vararg productos: Productos) {
        for (producto in productos) {
            addProducto(producto)
        }
    }

    fun deleteProductos(productos: Productos, cantidadEliminar: Int) {
        if (productosCarrito.containsKey(productos)) {
            val cantidad: Int = productosCarrito[productos] ?: 0
            if (cantidadEliminar > 0) {
                if (cantidadEliminar >= cantidad) {
                    productosCarrito.remove(productos)
                } else {
                    productosCarrito[productos] = cantidad - cantidadEliminar
                }
            }
        }
    }
}

fun main() {
    val carritoDeLaCompra = carritoDeLaCompra()
    println("Añado dos productos")
    carritoDeLaCompra.addProducto(Productos.BICI00)
    carritoDeLaCompra.addProducto(Productos.BICI00)
    carritoDeLaCompra.addProducto(Productos.BICI00)
    carritoDeLaCompra.addProducto(Productos.BICI00)
    carritoDeLaCompra.mostrarCarrito()
    println("Borro uno")
    carritoDeLaCompra.deleteProductos(Productos.BICI00, 1)
    carritoDeLaCompra.mostrarCarrito()
    println("Añado dos productos nuevos, mas el que estaba")
    carritoDeLaCompra.addProductos(Productos.TV00, Productos.MESA00)
    carritoDeLaCompra.mostrarCarrito()
}
