package com.ariel.digionebank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double,
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Salario base: R$$salario
        Auxilio: R$${calculoAuxilio()}
        Salario Total: R$${salario+calculoAuxilio()}
    """.trimIndent()
    }
