package fundamentos.operadores

import java.util.*

fun main(args: Array<String>) {
    println("Banana" === "Banana")
    println(3 !== 2)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    val d1 = Date(0)
    val d2 = Date(0)

    // Igualdade referencial ( compara se a referencia é a mesma ), em relação a referencia de memoria.
    println("Resultado com '===' ${d1 === d2}")

    // Igualdade estrutural ( compara se os valores são iguais ), executa o equals do objeto.
    println("Resultado com '==' ${d1 == d2}") // ou d1.equals(d2)
}