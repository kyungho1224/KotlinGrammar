package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    var a = 10 + 1
    var b = 10 - 1
    var c = 1 * 9
    var d = 20 / 3
    var e = 20 % 3
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    a += 10
    b -= 10
    c *= 3
    d /= 4
    e %= 2
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    println()

    a++
    b--
    println(a)
    println(b)

    println()

    var g = a > b
    var h = a == b
    var i = !h
    println(g)
    println(h)
    println(i)

    println()

    val j = h && i
    val k = h || i
    println(j)
    println(k)

}