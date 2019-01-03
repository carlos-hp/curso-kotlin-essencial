package collections

fun main(args: Array<String>) {
    val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("Sem Ordem")
    for (aprovado in aprovados) {
        aprovado.print()
    }

    val aprovadosEmOrdem1 = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("\nLinked...")
    for (aprovado in aprovadosEmOrdem1) {
        aprovado.print()
    }

    val aprovadosEmOrdem2 = sortedSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("\nSorted...")
    for (aprovado in aprovadosEmOrdem2) {
        aprovado.print()
    }

    aprovados.sortedBy { it.substring(1) }.print()
}