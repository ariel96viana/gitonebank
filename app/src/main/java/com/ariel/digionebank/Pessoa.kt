package com.ariel.digionebank

class Pessoa {

    var nome: String = "Ariel Viana Oliveira"

    var cpf: String = "123.456.789-00"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"


}