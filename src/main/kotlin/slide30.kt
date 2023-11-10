/*fun main() {
// Define-se uma string a variavel
    val myText = "Hello"
// mostra o conteúdo da variavel
    println(myText)
// mostra o primeiro caractere da variavel
    println(myText[0])
// mostra o segundo caractere da variavel
    println(myText[1])
// mostra o primeiro caractere da variavel usando o método get()
    println(myText.get(0))
// mostra o segundo caractere da varivel usando o método get()
    println(myText.get(1))
// Converte valor da variavel para minuscula
    println(myText.toLowerCase())
// Converte o valor da variavel para maiscula
    println(myText.toUpperCase())
// mostra o tamanho da variavel
    println(myText.length)
// Verifica e mostra se o valor da variavel é igual a "hello"
    println(myText.equals("hello"))
// Verifica e mostra se se o valor da variavel é igual a "hello" usando o operador == agora
    println(myText == "hello")
// Verifica e mostra se o valor da variavel começa com "H"
    println(myText.startsWith(prefix = "H"))
// Verifica e mostra se o valor da variavel termina com "H"
    println(myText.endsWith(suffix = "H"))
// mostra os caracteres do valor da variavel entre o indice 0 e 2 da variavel
    println(myText.substring(0, 2))
}*/

fun main () {
    //Define-se uma string a variavel
    val conteudo = "cucamonga"

    //Verifica se o valor da variavel é maior que 10
    if(conteudo.length > 10)
    {
        print("Mensagem grande") //mostra a mensagem
    }
    else //caso não
    {
        //Verifica se o valor da variavel é ""cucamonga
        if(conteudo == "cucamonga")
        {
            //Foi definido uma mensagem com diferentes valores a partir da variavel.
            //Foi usado o método uppercase() para deixar em caixa alta o valor da variavel
            //Length para usar o tamanho da variavel e usado o método equals para fazer um comparativo
            println("Eu quero viajar para "+conteudo.uppercase()+" pois lá sei que posso " +
                    "jantar por apenas "+conteudo.length+" reais, te garanto que é "+conteudo.equals("cucamonga"))
        }
        else // caso não
        {
            print("Caminho errado")
        }
    }

}