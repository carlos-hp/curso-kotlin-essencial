package fundamentos.controle

fun main(args: Array<String>) {
    val nota: Double = 9.3

    // Usando operador range
    if (nota in 9..10) {
        println("Fantástico")
    } else if (nota in 7..8) {
        println("Parábens")
    } else if (nota in 4..6) {
        println("Tem como recuperar")
    } else if (nota in 0..3) {
        println("Te vejo no proximo semestre")
    } else {
        println("Nota inválida")
    }

    println(5 in 7..4) // O operador range deve respeitar do menor para o maior

    //assim seria o range decrescente
    println(5 in 7 downTo 4)

    //assim seria o range crescente.
    println(5 in 4 until 7)
}