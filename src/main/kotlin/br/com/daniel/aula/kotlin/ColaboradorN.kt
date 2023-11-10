package br.com.daniel.aula.kotlin

open class ColaboradorN(var salario: Float, nome: String, peso: Float, altura: Float){
    val ativo = true // Colaborador está ativo por padrão.
    val bonus get() = salario > 0 // Método para verificar se há bônus.
}