//fun main() {
//    // Define o valor da variavel
//    var a = 1 + 1
//
//    // Printa o valor da variável
//    println(a)
//
//    // Abaixo vários modos de mostrar a variavel
//    println("result: "+a)
//    println("result: $a")
//    println("result: ${a}")
//    println("result: ${a+1}")// printa o valor +1
//}

fun main() {
    // Define o valor da variavel
    var a = 1 + 9
    //recebe retorno da funcao
    a = soma(a)
}

fun soma(param: Int):Int {
    // Abaixo vários modos de mostrar o parametro da função
    println("result: "+param)
    println("result: $param")
    println("result: ${param}")
    println("result: ${param+1}")// mostra o parametro +1
    
    return param //retorna valor parametro
}