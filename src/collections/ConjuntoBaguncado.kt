package collections

fun Any.print() = println(this)

fun main(args: Array<String>) {
    val conjunto = hashSetOf(3, 'a', "texto", true, 3.14)
    //conjunto.get(1)

    conjunto.add(3).print()
    conjunto.add(10).print()

    conjunto.size.print()

    conjunto.remove("a").print()
    conjunto.remove('a').print()

    conjunto.contains('a').print()
    conjunto.contains("Texto").print()
    conjunto.contains("texto").print()

    val nums = setOf(1, 2, 3)//conjunto somente leitura!
    //nums.add(4)

    (conjunto + nums).print()

    (conjunto - nums).print()

    conjunto.intersect(nums).print()// uso não muda o conjunto !

    conjunto.retainAll(nums)//muda o conjunto que fez a chamada
    conjunto.print()

    conjunto.clear()
    conjunto.isEmpty().print()
}