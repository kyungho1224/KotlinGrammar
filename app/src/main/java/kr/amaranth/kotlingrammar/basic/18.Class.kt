package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    val car: Car = Car("good engine", "big")
    val superCar: SuperCar = SuperCar("super engine", "big", "white")
    val niceCar: NiceCar = NiceCar("nice engine", "very big", "black")

    val runnableCar = RunnableCar("engine", "body")
    runnableCar.ride()
    runnableCar.drive()
    runnableCar.navi("부산")

    // 인스턴스의 멤버 변수에 접근 하는 방법
    val runningCar = RunningCar("small engine", "small body")
    println(runningCar.engine)
    println(runningCar.body)

    val testClass = TestClass()
    testClass.test(1)
    testClass.test(1, 2)

}

// 클래스 생성(1)
class Car(var engine: String, var body: String) {

}

// 클래스 생성(2)
class SuperCar {
    private var engine: String
    private var body: String
    private var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스 생성(3)
// 필수 인자(engine, body)와 선택 인자(door)
class NiceCar(engine: String, body: String) {

    private var door: String = ""

    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }

}

// 클래스 생성(4)
class GoodCar {
    private var engine: String = ""
    private var body: String = ""
    private var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunnableCar(engine: String, body: String) {
    fun ride() {
        println("ride")
    }

    fun drive() {
        println("drive")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지 설정")
    }
}

class RunningCar {
    var engine: String
    var body: String

    init {
        // 초기화
        println("RunningCar make success")
    }

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    fun ride() {
        println("ride")
    }

    fun drive() {
        println("drive")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지 설정")
    }
}

// overloading
class TestClass() {
    fun test(a: Int) {
        println("parameter one: $a")
    }

    fun test(a: Int, b: Int) {
        println("parameter two: $a, $b")
    }
}