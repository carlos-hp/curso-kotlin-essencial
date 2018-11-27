package funcoes

/**
 * O primeiro <E>, indica que a função irá fazer uso de genérics.
 * * lista: List<E> -> indica que receberá uma variavel lista de qualquer coisa.
 * * filtro: (E) -> indica que receberá um elemento do tipo E, e retornará um boolean.
 * * List<E> -> retorna uma lista de qualquer coisa.
 */
fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {
    val listaFiltrada = ArrayList<E>()
    for (e in lista) {
        if (filtro(e)) { // aqui faz um referencia onde filtro : (E) e retorna um boolean.
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean {
    return nome.length == 3
}

fun main(args: Array<String>) {
    val nomes = listOf("Ana", "Pedro", "Bia", "Gui", "Rebeca")
    println(filtrar(nomes, ::comTresLetras))
}