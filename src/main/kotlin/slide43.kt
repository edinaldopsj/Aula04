//fun main() {
//    // variavel iniciando em 0.
//    var i = 0
//
//    // faz um loop enquanto 'i' for menor que 10.
//    while (i < 10){
//        // Incrementa 'i' em 1 a cada iteração do loop.
//        i++
//
//        // Verifica se 'i' é igual a 4.
//        if (i == 4)
//        // Se sim, para o loop
//            break
//
//        // Printa o valor atual de 'i' seguido de uma vírgula.
//        print("$i, ")
//    }
//    // Após o 'break', ou quando 'i' chegar a 10, o loop encerra e o programa continua após o loop.
//}

fun main() {
    // variavel iniciando em 0
    var j = 0

    // faz um loop enquanto 'j' for menor que 10.
    while (j < 10) {
        // Incrementa 'j' em 1 a cada iteração do loop.
        j++

        // Verifica se 'j' é igual a 4.
        if (j == 4)
        // Se 'j' for igual a 4, ignora as instruções restantes no loop e continua na próxima iteração.
            continue

        // Printa o valor atual de 'j' seguido de uma vírgula.
        // Esta linha não será fazda quando 'j' for 4 devido ao 'continue'.
        print("$j, ")
    }
    // O loop termina naturalmente quando 'j' alcança 10.
}