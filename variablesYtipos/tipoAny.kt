fun main(args: Array<String>) {
    val numeros = arrayOf(1, 2, 3, 4, 5)
    println("Tipo de datos de numeros: ${dameTipo(numeros)}")

    val entero = 10
    println("Tipo de datos de entero: ${dameTipo(entero)}")

    val cadena = "Hola mundo"
    println("Tipo de datos de cadena: ${dameTipo(cadena)}")

    val boleano = true
    println("Tipo de datos de boleano: ${dameTipo(boleano)}")

    val lista = listOf(1, 2, 3, 4, 5)
    println("Tipo de datos de lista: ${dameTipo(lista)}")

    // val nullValue: Any? = null
    // if (nullValue != null) {
    //     println("Tipo de datos de nullValue: ${dameTipo(nullValue)}")
    // } else {
    //     println("nullValue es nulo")

    // val lambda: () -> Unit = { println("Lambda ejecutada") }
    // println("Tipo de datos de lambda: ${dameTipo(lambda)}")
}

// Funcion creada, devuelve el tipo de dato accediendo a su instancia de clase
fun dameTipo(obj: Any):Any {
    return obj::class.simpleName?:"Desconocido"
}