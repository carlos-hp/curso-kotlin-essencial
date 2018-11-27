package funcoes

inline fun transacao(funcao: () -> Unit) {
    println("abrindo transação...")
    try {
        funcao()
    } finally {
        println("fechando transação")
    }
}

fun main(args: Array<String>) {
    transacao {
        println("Executando Sql 1...")
        println("Executando Sql 2...")
        println("Executando Sql 3...")
    }
}