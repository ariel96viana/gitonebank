package com.ariel.digionebank.testes

import com.ariel.digionebank.Funcionario

class imprimeRelatorioFuncionario {

    companion object{
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}