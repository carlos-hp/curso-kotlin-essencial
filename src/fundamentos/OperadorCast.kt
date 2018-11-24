package fundamentos

fun imprimirConceito(nota: Any) {
    // as -> usado para cast.
    // as? -> usado para cast seguro, evita um runtimeexpection porém retorna nullo.
    when (nota as? Int ?: 5) {
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        else -> println("Nota Inválida!")
    }
}

fun main(args: Array<String>) {
    val notas = arrayOf(9.6, 3.8, 7.2, 5.5, 4.1)
    for (nota in notas) {
        imprimirConceito(nota)
    }
}