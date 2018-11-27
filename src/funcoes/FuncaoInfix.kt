package funcoes

data class Produto(val nome: String, val preco: Double)

// Funcoes infix é uma função entre operadores!
infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main(args: Array<String>) {
    val p1 = Produto("IPad", 2349.00)
    val p2 = Produto(nome = "Borracha", preco = 2349.00)

    println(p1 maisCaroQue p2) // modo otimizado.
    println(p1.maisCaroQue(p2))// modo tradicional.
}