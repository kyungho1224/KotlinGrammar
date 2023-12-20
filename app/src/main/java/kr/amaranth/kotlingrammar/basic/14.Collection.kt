package kr.amaranth.kotlingrammar.basic

// list, set, map

fun main(args: Array<String>) {

    /* Immutable Collection */
    // List -> 중복 허용
    val numberList = listOf<Int>(1, 2, 3)
    println(numberList)
    numberList[0]
    numberList.get(0)

    // Set
    // -> 중복 허용하지 않는다, 순서를 보장하지 않는다
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)
    numberSet.forEach {
        println(it)
    }

    // Map -> Key, Value 방식
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2, "three" to 3)
    println(numberMap.get("one"))
    println(numberMap["one"])

    /* Mutable Collection */
    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3, 45)
    mNumberList.remove(2)
    mNumberList.clear()

    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4, 5, 5, 1)
    mNumberSet.add(10)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("nine", 9)
    mNumberMap["ten"] = 10
    mNumberMap.replace("one", 11)
    mNumberMap.remove("one")

}