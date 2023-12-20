package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    val array = arrayOf<Int>(1, 2, 3)

    val number = array.get(0)
    println(number)

    array.set(0, 100)
    val number2 = array.get(0)

    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('a', 'b', 'c')
    val a3 = doubleArrayOf(1.2, 3.14, 100.123)
    val a4 = booleanArrayOf(true, true, false, true)

    val a5 = Array(10) { 0 }
    val a6 = Array(5) { 1;2;3;4;5 }

}