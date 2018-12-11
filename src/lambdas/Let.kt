package lambdas

fun main(args: Array<String>) {
    val listWithNulls: List<String?> = listOf("A", null, "B", null, "C", null)

    // o let é parecido com o let, porém não retorna a instancia do proprio elemento e o conteudo é acesso atraves
    // do operador it.
    for (item in listWithNulls) {
        item?.let {
            println(it)
        }
    }
}