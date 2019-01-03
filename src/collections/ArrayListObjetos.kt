package collections

data class Fruta(var nome: String, var preco: Double)

fun main(args: Array<String>) {
    var frutas = arrayListOf(Fruta("Banana", 1.50), Fruta("Morango", 3.20))

    for (fruta in frutas) {
        println("${fruta.nome} - R$ ${fruta.preco}")
    }
    //como é um data class por default já vem implementado o equals e o hashcode.
    println(frutas.contains(Fruta("Banana", 1.50)))

    //no caso vai trazer elementos com preços distintos.
    println(frutas.distinctBy { it.preco })
}