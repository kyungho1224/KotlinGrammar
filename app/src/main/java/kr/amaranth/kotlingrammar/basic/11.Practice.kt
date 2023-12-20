package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    val value: Int? = null

    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null
    when (value2) {
        true -> println("value2 is true")
        false -> println("value2 is false")
        else -> println("value2 is null")
    }

    val value3 = when (value2) {
        true -> 1
        false -> 0
        else -> -1
    }
    println(value3)

    val value4: Int = 10
    when (value4) {
        is Int -> println("value4 is int")
        else -> println("value4 is not int")
    }
    println(value4)

    val value5: Int = 87
    when (value5) {
        in 60..70 -> {
            println("value5 is in 60-70")
        }
        in 70..80 -> {
            println("value5 is in 70-80")
        }
        in 80..90 -> {
            println("value5 is in 80-90")
        }
    }

}