package com.draccotech.exerciciomodulo4

fun main(){

    //* funçao soma -> tarefa linha
    calculadora(8,2, ::soma)


    //* funçao multiplica -> tarefa linha
    calculadora(8,2, ::multiplica)

    /*
        Crie uma lista com numeros inteiros de 1 a 99
            * Utilizando essa lista crie um filtro que retorne uma lista
        contendo os numeros pares da lista original
     */
    val listNumbers1 = mutableListOf<Int>()

    for (i in 1..99) {
        listNumbers1.add(i)
    }

    val listNumbers2 = listNumbers1.filter { it % 2 == 0 }
    // Caso queira visualizar o resultado, só descomentar a linha abaixo
    println(listNumbers2)

    /*
        Crie uma lista de String com 4 nomes
            * Utilizando o operador map concatene a string "Olá"
        antes de cada nome
            * Percorra a lista modificada usando um foreach e imprima
        todos os valores
     */

    val listName = listOf("Danilo", "Priscila", "Yago", "Matheus")

    listName.map{
        "Olá $it"
    }.forEach {
        println(it)
    }


}


    /*
        Crie uma função que receba dois numeros inteiro de parametro
        e retorne o valor da soma
     */

    fun soma(number1: Int, number2: Int): Int{
        return number1 + number2
    }

    /*
        Crie uma função compacta que receba dois numeros inteiro de
        parametro e retorne o resultado da multiplicação deles
     */

    fun multiplica(number1: Int, number2: Int) = number1 * number2

    /*
        Crie uma função de calculadora que recebe dois inteiros de
        parametro e um terceiro parametro do tipo funcao. Esta funçao
        de parametro, deve receber dois inteiro de parametro e retornar
        um inteiro
            * funçao soma -> usado na linha 4
            * funçaõ multiplicação -> usado na linha 5
     */

    fun calculadora(number1: Int, number2: Int, operation: (Int, Int) -> Int){
        println(operation(number1, number2))
    }









