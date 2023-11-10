//fun main() {
//    uma variável para armazenar a nota do aluno.
//    val nota = 4f // ou 4.toFloat()
//
//    //  uma variável para armazenar o resultado da avaliação.
//    var resultado = ""
//
//    // Usa a estrutura `when` para avaliar a nota do aluno e atribuir o resultado apropriado à variável `resultado`.
//    resultado = when (nota) {
//        // Se a nota estiver entre 6 e 10, a variável resultado recebe o valor "Aprovado".
//        in 6f..10f -> "Aprovado"
//
//        // Se a nota estiver entre 4 e 6, a variável resultado recebe o valor "Recuperação".
//        in 4f..6f -> "Recuperação"
//
//        // Se a nota estiver entre 0 e 4, a variável resultado recebe o valor "Reprovado".
//        in 0f..4f -> "Reprovado"
//
//        // Se a nota não estiver dentro de nenhum dos intervalos anteriores, a variável resultado recebe o valor "INVALIDA".
//        else -> "INVALIDA"
//    }
//    // Printa o resultado.
//    println(resultado)
//}

fun main() {
    //  uma variável para armazenar a salario.
    val salario = 500 // ou 4.toFloat()

    //  uma variável para armazenar o resultado da avaliação.
    var resultado = ""

    // Usa a estrutura `when` para avaliar a condicao financeira e armazena na variavcel `resultado`.
    resultado = when (salario) {
        // Se o salario estiver entre 600 e 1000, a variável resultado recebe o valor "Tá bem".
        in 600..1000 -> "Tá bem"

        // Se a nota estiver entre 400 e 600, a variável resultado recebe o valor "Maios ou menos".
        in 400..600 -> "Mais ou menos"

        // Se a nota estiver entre 0 e 400, a variável resultado recebe o valor "Tá lascado".
        in 0..400 -> "Tá lascado"

        // Se a nota não estiver dentro de nenhum dos intervalos anteriores, a variável resultado recebe o valor "INVALIDA".
        else -> "INVALIDA"
    }
    // Printa o resultado.
    println(resultado)
}