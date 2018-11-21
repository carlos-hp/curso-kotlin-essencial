package fundamentos.operadores

fun main(args: Array<String>) {
    val executouTrabalho1: Boolean = true
    val executouTrabalho2: Boolean = true

    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    val comprouTV50: Boolean = executouTrabalho1 && executouTrabalho2
    val comprouTV32: Boolean = executouTrabalho1 xor executouTrabalho2

    println(comprouSorvete)
    println(comprouTV50)
    println(comprouTV32)

    if (!comprouSorvete) {
        println("A saúde agradece.")
    }
}