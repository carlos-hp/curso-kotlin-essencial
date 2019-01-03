package collections

fun main(args: Array<String>) {
    val alunos = arrayListOf("Amanda", "André", "Bernando", "Carlos")

    // 1ª maneira
    alunos.forEach { println(it) }

    // 2ª maneira
    alunos.forEach({
        println(it)
    })

}