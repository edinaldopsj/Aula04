//fun main() {
//    //  uma lista do tipo `String` para armazenar as siglas dos estados brasileiros.
//    val estados = ArrayList<String>()
//
//    // Adiciona as siglas dos estados brasileiros à lista.
//    estados.add("RS")
//    estados.add("MG")
//    estados.add("SP")
//    estados.add("RJ")
//
//    // Printa a sigla do índice 0 do array.
//    println(estados[0])
//}

fun main() {
    //  uma lista do tipo `String` para armazenar o nome dos lanches.
    val lanches = ArrayList<String>()

    // Adiciona lanches à lista.
    lanches.add("X-Salada")
    lanches.add("X-Bacon")
    lanches.add("Dogão")
    lanches.add("Podrão Gourmet")

    //O Foreach percorre o array printando os valores.
    lanches.forEach { println(it) }
}