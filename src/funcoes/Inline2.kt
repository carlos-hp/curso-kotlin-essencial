package funcoes

inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no metodo $nomeFuncao")
    try {
        return funcao()
    } finally {
        println("Método $nomeFuncao finalizado...")
    }
}

fun somar2(a: Int, b: Int): Int {
    return a + b
}

// em Toda fução inline a ultima linha dará o retorno do valor.( isso vem do lambda).
fun main(args: Array<String>) {
    val resultado = executarComLog("somar") {
        somar2(3, 4)
    }
    println(resultado)
}