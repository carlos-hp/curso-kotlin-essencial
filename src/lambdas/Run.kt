package lambdas

data class Casa(var endereco: String = "", var num: Int = 0)

fun main(args: Array<String>) {
    val casa = Casa()

    //É equivalente ao apply, voce acessa os atributos diretamente, porém não retorna a instancia proprio do elemento.
    casa.run {
        endereco = "Rua Abc"
        num = 1544
    }

    print(casa)
}