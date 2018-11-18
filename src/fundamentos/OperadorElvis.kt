package fundamentos

fun main(args: Array<String>) {
    val opcional: String? = null
    val obrigatorio: String = opcional ?: "Valor Padrão" // operador elvis '?:', se for nulo assume o valor padrão.

    println(obrigatorio)
}