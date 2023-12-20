package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4)
    a.add(0, 10)
    a.set(0, 150)
    a[0] = 200
    a.removeAt(1)

    val b = mutableSetOf<Int>(1, 2, 3, 4)
    b.add(2)
    b.add(10)
    b.remove(2)
    b.remove(1010)

    val c = mutableMapOf<String, Int>("one" to 1)
    c.put("two", 2)
    c["three"] = 3
    c.replace("two", 22)
    println(c.keys)
    println(c.values)
    c.clear()

}