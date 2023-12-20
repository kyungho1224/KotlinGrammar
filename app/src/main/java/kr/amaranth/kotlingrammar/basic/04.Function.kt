package kr.amaranth.kotlingrammar.basic

// fun 함수명 (변수명: 타입, 변수명: 타입 ...) : 반환형 {
//      내용
//      return 반환값
// }

fun main(args: Array<String>) {
    // 함수 호출
    println(plus(2, 3))

    // 인수를 명시적으로 호출
    println(plus(first = 10, second = 20))

    println()

    println(plusFive(21, 10))
    println(plusFive(20))

    println()

    println(printPlus(1, 6))

    plusMany(1, 2, 3, 4, 5, 6)
}

// 기본형 함수
fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// 디폴트 값을 갖는 함수
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환값이 없는 함수
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second;
    println(result)
}

// 간단하게 함수를 선언
fun plusShort(first: Int, second: Int) = first + second

// 가변인자를 갖는 함수 선언
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}