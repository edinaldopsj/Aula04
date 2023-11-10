package br.com.daniel.aula.kotlin

open class ClienteN(var renda: Float, nome: String, peso: Float, altura: Float){
    val aprovacao get() = renda > 1000 // Método para aprovação financeira.
}