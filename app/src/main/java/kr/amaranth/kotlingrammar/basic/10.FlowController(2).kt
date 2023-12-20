package kr.amaranth.kotlingrammar.basic

// When

fun main(args: Array<String>) {

    val value: Int = 3

    when (value) {
        1 -> {
            println("values is 1")
        }
        2 -> {
            println("values is 2")
        }
        3 -> {
            println("values is 3")
        }
        else -> {
            println("not found value")
        }
    }

    when (value) {
        1 -> println("values is 1")
        2 -> println("values is 2")
        3 -> println("values is 3")
        else -> println("not found value")
    }

    val whenValue = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(whenValue)

}