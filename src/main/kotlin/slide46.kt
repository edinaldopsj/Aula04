//fun main() {
//    // função passando o parametro 1.
//    mensagem(1)
//    // função passando o parametro 1.
//    mensagem(1)
//    // função passando o parametro 2.
//    mensagem(2)
//}
//
//fun mensagem(n: Int) {
//    // Verifica se o parametro é igual a 1.
//    if (n == 1) {
//        // Se for, printa "Feliz natal!"
//        println("Feliz natal!")
//    } else {
//        // Se não for, printa "Feliz aniversário!"
//        println("Feliz aniversário!")
//    }
//}

fun main() {
    // Invoca a função passando o parametro 2.
    saudacao(2)
    // Invoca a função passando o parametro 3.
    saudacao(3)
    // Invoca a função passando o parametro 2.
    saudacao(2)
}

fun saudacao(n: Int) {
    // Verifica se o parametro é igual a 2.
    if (n == 2) {
        // Se for, printa a mensagem
        println("É iso ai!")
    } else {
        // Se não for, printa outra mensagem
        println("Tamo junto!")
    }
}