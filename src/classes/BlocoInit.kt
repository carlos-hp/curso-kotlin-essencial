package classes

class Filme3(nome: String, anoLancamento: Int, genero: String) {
    val nome: String
    val anoLancamento: Int
    val genero: String

    /**
     * Seria a ideia de fazer algo no Construtor, por exemplo: Formatar um data, ou algo assim.
     */
    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme3("Os Incríveis", 2004, "Ação")
    println("${filme.nome} foi lançada em ${filme.anoLancamento}.")
}