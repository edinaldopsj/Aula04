/*fun main() {
    // Dá um valor a variavel
    val myText = "Hello"
    // Mostra o conteúdo da string
    println(myText)
    // Verifica se o valor da variavel contém "a"
    println(myText.contains("a"))
    // Verifica se valor da variavel contém "b"
    println(myText.contains("b"))
    // Verifica se valor da variavel contém "l"
    println(myText.contains("l"))
}*/

fun main() {
    // Dá um valor a variavel
    val textao = "Boa noite galera"
    // Mostra o conteúdo da string
    println(textao)
    // Verifica se o valor da variavel contém "a"
    println(textao.contains("a"))
    // Verifica textao valor da variavel contém "b"
    println(textao.contains("b"))
    // Verifica se valor da variavel contém "l"
    println(textao.contains("l"))

    //Verifica se o valor da string contem "a" ou  "b"
    if(textao.contains("a") || textao.contains("b"))
    {
        print("tudo certo")//Mostra uma mensagem
    }
}