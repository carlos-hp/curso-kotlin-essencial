package classes

var desconto: Double = 0.0

class ItemDePedio(val nome: String, val preco: Double) {
    companion object {
        fun create(nome: String, preco: Double) = ItemDePedio(nome, preco)
        //@JvmStatic var desconto: Double = 0.0
    }

    fun precoComDesconto() = preco - preco * desconto
}

fun main(args: Array<String>) {
    val item1 = ItemDePedio.create("TV 50 Polegadas", 2989.90)
    val item2 = ItemDePedio("Liquidificador", 200.0)

    desconto = 0.10

    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}