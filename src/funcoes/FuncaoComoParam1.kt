package funcoes

class Operacoes {
    fun somar(a: Int, b: Int): Int {
        return a + b
    }
}

fun somar(a: Int, b: Int): Int {
    return a + b
}

fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int): Int {
    return funcao(a, b)
}

fun main(args: Array<String>) {
    // Função de dentro de uma classe.
    println(calc(2, 3, Operacoes()::somar))

    // Função Top Level (aquela que não tem classe);
    println(calc(2, 3, ::somar))
}