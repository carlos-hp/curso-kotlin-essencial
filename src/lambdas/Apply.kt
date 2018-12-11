package lambdas

class Calculadora2 {
    var resultado = 0

    fun soma(valor1: Int, valor2: Int) {
        resultado += valor1 + valor2
    }

    fun add(valor: Int) {
        resultado += valor
    }
}

fun main(args: Array<String>) {
    val calculadora = Calculadora2()

    //forma 1
    calculadora.apply { soma(4, 5) }.apply { add(5) }.apply { println(resultado) }

    //forma 2
    calculadora.apply {
        soma(4, 5)
        add(5)
        println(resultado)
    }

    //inline function
    with(calculadora) {
        soma(4, 5)
        add(5)
        println(resultado)
    }
}