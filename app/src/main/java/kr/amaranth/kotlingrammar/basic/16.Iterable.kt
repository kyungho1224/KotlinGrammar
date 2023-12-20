package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // for basic
    for (item in a) {
        print(item)
        print(",")
    }

    // for with index
    for ((index, item) in a.withIndex()) {
        println("index: $index, item: $item")
    }

    // for each
    a.forEach {
        print(it)
    }
    println()

    // for each
    a.forEach { item ->
        print(item)
    }
    println()

    // for each with index
    a.forEachIndexed { index, item ->
        print("index: $index, item: $item")
    }
    println()

    // for until -> 마지막을 포함하지 않는다
    for (i in 0 until a.size) {
        print(a[i])
    }
    println()

    // 오름차순 with step
    for (i in 0 until a.size step (2)) {
        print(a[i])
    }
    println()

    // 내림차순
    for (i in a.size - 1 downTo (0)) {
        print(a[i])
    }
    println()

    for (i in a.size - 1 downTo (0) step (2)) {
        print(a[i])
    }
    println()

    // .. -> 마지막을 포함
    for (i in 0..a.size) {
        print(i)
    }

    // while
    var b: Int = 0
    var c: Int = 4
    while (b < c) {
        println("b: $b")
        b++
    }

    // do-while
    do {
        println("hello")
    } while (b > c)

}