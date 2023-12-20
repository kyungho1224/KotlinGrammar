package kr.amaranth.kotlingrammar.basic


// 상속

fun main(args: Array<String>) {

    val truck = Truck("engine", "body")
    truck.drive()

}

open class _Car(engine: String, body: String) {
    open fun drive() {
        println("달린다")
    }

    open fun stop() {

    }
}

class Truck(engine: String, body: String) : _Car(engine, body) {
    override fun drive() {
        println("힘차게 달린다")
    }

    override fun stop() {
        super.stop()
    }
}

class Bus(engine: String, body: String) : _Car(engine, body) {

}