package com.ariel.digionebank

import com.ariel.digionebank.testes.TesteAutenticacao

fun main() {

    val jose = Cliente(
        nome = "Jose Antonio",
        cpf = "123.123.456-77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}
