fun main(args: Array<String>) {
    val nombre: String = "Elias"
    println(nombre)
    println("Bonito mensaje")

    // inferencia de tipos: intenta detectar el tipo a partir del valor
    var edad = 25   // variables mutables
    println(edad)

    val booleano = false    // variables inmutables
    println(booleano)

    // Concatenacion y Constantes
    println("La edad de Elias es " + edad)
    println("Un anio despues...")
    edad++
    println("La edad de Elias es " + edad)
    println("Hola ${edad}")
    // usando String.format y especificando el tipo de variable, como en C, C++
    println(String.format("La edad de Elias es de %d", edad))

    // Sintaxis de Arrays
    val mesesDelAnio:Array<String> = arrayOf("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio")
    for ((index, value) in mesesDelAnio.withIndex()) {
        println("Indice: $index, Valor: $value")
    }

    // Podemos inicializar array con un valor, ejemplo 5 posicion con valor 0
    val miMatriz = Array(5){0}  // la clave es que podemos incluir expresiones lambda
    for (i in miMatriz) {       // con eso podemos incluir valores variados
        println(i)
    }

    val paramestrizado = arrayOf("5", "10", "15", "20")
    
    // como usamos la funcion map con expresion lambda y sin parametros, podemos usar it como variable de bucle
    val listadoNumeros = paramestrizado.map{it.toInt()} // se mapea como int, ver callback
    println("Listado: $listadoNumeros")

    val suma = listadoNumeros.sum()
    println("La suma: $suma")

}