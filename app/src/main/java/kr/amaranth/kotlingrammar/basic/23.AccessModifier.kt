package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    val testAccess = TestAccess("kim")
//    testAccess.name
    testAccess.test("a")

    val reward = Reward()
//    reward.rewardAmount = 2000


}

class Reward() {
    private var rewardAmount: Int = 1000
}

class TestAccess {
    private var name: String = ""

    constructor(name: String) {
        this.name = name
    }

    fun test(a: String) {
        println("test")
    }

    private fun test() {

    }
}