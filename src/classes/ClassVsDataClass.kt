package classes

class Geladeira(val marca: String, val litros: Int)

/**
 * O data class, implementa varios metodos de forma automatica, ex: equals, hashcode, copy etc..
 */
data class Televisao(val marca: String, val polegadas: Int)

fun main(args: Array<String>) {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)

    println(g1 == g2)// o == chama o equals, o === compara a referencia.

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)

    println(tv1 == tv2)//equals
    println(tv1 === tv2)//
    println(tv1.toString())
    println(tv1.copy(polegadas = 42))

    // Destructuring em data class *Somente data class aceita o destructuring.
    val (marca, polegada) = tv1
    println("$marca $polegada'")
}