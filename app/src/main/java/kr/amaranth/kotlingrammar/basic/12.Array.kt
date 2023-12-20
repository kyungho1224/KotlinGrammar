package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    val one: Int = 1
    val two: Int = 2
    val three: Int = 3
    val four: Int = 4
    val five: Int = 5

    // 배열 생성
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1 is Array)
    println(group1)

    var group2 = arrayOf(1, 2, 3, 4, 3.15, "Kotlin")
    println(group2)

    // 값 꺼내기
    var number1 = group1.get(0)
    println(number1)
    number1 = group1[0]
    println(number1)

    // 값 변경하기
    group1.set(0, 50)
    group1[0] = 100

}