package kr.amaranth.kotlingrammar.basic

val number10: Int = 10

fun main(args: Array<String>) {

    println(number10)

    val test = Test("aaa")
    println(test.name)
    test.testFun()
    println(test.name)

}

class Test(var name: String) {

    fun testFun() {
        var birth: String = "1984/12"
        name = "zzz"
    }

}