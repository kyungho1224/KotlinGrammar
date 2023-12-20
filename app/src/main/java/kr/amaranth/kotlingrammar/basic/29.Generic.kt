package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    val list1 = listOf(1, 2, 3, "a")
    val b: String = list1[2].toString()

    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2]

    val list3 = listOf(1, 2, 3, 4, 3.14, "a", 10)
    val list4 = listOf<Int>(1, 2, 3)

    val list5 = listOf<Any>(1, 2, 3, "a", 3.14, 100.144, 10, 'a', false)

}

