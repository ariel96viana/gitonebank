package com.ariel.digionebank

class Pessoa {
    var nome: String = "Ariel Viana Oliveira"
    var cpf: String = "123.456.789-00"
}

fun main(){

    val pessoa = Pessoa()
    println("Nome do cliente: ${pessoa.nome}")
    println("CPF: ${pessoa.cpf}")

}