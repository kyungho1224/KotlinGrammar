package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    var result1 = plusThree(1, 2, 3)
    var result2 = minusThree(10, 1, 2)
    var result3 = multiplyThree(2, 2, 2)
    var result4 = multiplyThree()
    println(result1)
    println(result2)
    println(result3)
    println(result4)

}

fun plusThree(first: Int, second: Int, third: Int): Int {
    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first: Int = 1, second: Int = 1, third: Int = 1): Int {
    return first * second * third
}

// 내부 함수
fun showMyPlus(first: Int, second: Int): Int {
    println(first)
    println(second)

    fun plus(first: Int, second: Int): Int {
        return first + second
    }
    return plus(first, second)
}