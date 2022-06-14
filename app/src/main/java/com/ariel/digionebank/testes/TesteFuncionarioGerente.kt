package com.ariel.digionebank.testes

import com.ariel.digionebank.Gerente

fun main(){
    val maria = Gerente("Maria do Carmo", "147.258.369-00", 5000.00)
    imprimeRelatorioFuncionario.imprime(maria)
}