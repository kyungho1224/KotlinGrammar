package kr.amaranth.kotlingrammar.basic

// 제어 흐름
// if, else

fun main(args: Array<String>) {
    val a: Int = 5;
    val b: Int = 10

    // if/else (1)
    if (a > b) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 크지 않다")
    }

    println()

    if (a > b) {
        println("a가 b보다 크다")
    } else if (a < b) {
        println("a가 b보다 작다")
    } else {
        println("a와 b가 같다")
    }

    println()

    // 값을 리턴하는 if
    val max = if (a > b) {
        a
    } else {
        b
    }
    println("max: $max")

}