package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    val student = Student()
    student.eat()
    student.sleep()

    val teacher = Teacher()
    teacher.eat()
    teacher.sleep()

}

interface Person {
    fun eat()
    fun sleep()
}

class Student() : Person {
    override fun eat() {
        println("급식을 먹는다")
    }

    override fun sleep() {
        println("기숙사에서 잠을 잔다")
    }

}

class Teacher() : Person {
    override fun eat() {
        println("도시락을 먹는다")
    }

    override fun sleep() {
        println("집에서 잠을 잔다")
    }

}