package classes

class Cliente2 {
    var nome: String
        get() = "Meu nome é $field"
        set(value) {
            field = value.takeIf { value.isNotBlank() } ?: "Anônimo"
        }

    constructor(nome: String) {
        this.nome = nome
    }

}

fun main(args: Array<String>) {
    val c1 = Cliente2("")
    println(c1.nome)

    val c2 = Cliente2("Pedro")
    println(c2.nome)
}