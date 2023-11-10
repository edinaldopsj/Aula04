//fun main() {
//    // Dá o valor da variavel
//    val myText = "Hello"
//
//    //Nesta variavel concatena a variavel myText com ela mesma
//    val newText1 = myText+" "+myText
//
//    //Utiliza outro método de concatenação
//    val newText2 = "$myText $myText"
//
//    //Mostra a variavel MyText
//    println(myText)
//
//    //Mostra a variavel newText1
//    println(newText1)
//
//    //Mostra a variavel newText2
//    println(newText2)
//}

fun main() {
    // Dá o valor da variavel
    val texto = "Olha"

    //É armazenado na variavel o retono da funcao concate
    val nTexto = concate(texto)

    //Mostra o valor da variavel texto
    println(texto)

    //Mostra o valor da variavel nTexto
    println(nTexto)

}

//Função que retorna o parametro concatenado com texto fixo
fun concate(param: String): String{
    return "$param Novo valor"
}