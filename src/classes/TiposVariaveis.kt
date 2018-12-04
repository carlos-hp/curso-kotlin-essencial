package classes

val diretamentoNoArquivo = "Bom dia"

fun topLevel() {
    val local = "Fulano"
    println("$diretamentoNoArquivo $local")
}

class Coisa {
    var variavelDeInstancia: String = "Boa noite"

    companion object {
        /**
         * Os companions object funcionam como se fosse um objeto singleton associado a classe.
         * as constantes 'val' declaradas nele terão uma unica instancia. Porém é um comportamento
         * diferente do Java. Para ser igual é necessário a notação @JvmStatic.
         **/

        @JvmStatic
        val constanteDeClasse = "Ciclano"
    }

    fun fazer() {
        val local: Int = 7
        if (local > 3) {
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco")
        }
    }
}

fun main(args: Array<String>) {
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}