package com.ariel.digionebank.testes

import com.ariel.digionebank.Analista

fun main() {
    val joao = Analista(nome = "João Pedro", cpf = "987.654.321-99", salario = 2000.00)
    imprimeRelatorioFuncionario.imprime(joao)
}
