package fundamentos.controle

fun main(args: Array<String>) {
    val nota = 10

    when (nota) {
        10, 9 -> println("Fantástico")
        8, 7 -> println("Parábens")
        6, 5, 4 -> println("Tem como recuperar")
        in 0..3 -> println("Te vejo no proximo semestre")
        else -> println("Nota inválida")
    }

}