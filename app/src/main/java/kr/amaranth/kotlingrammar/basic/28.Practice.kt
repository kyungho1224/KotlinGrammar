package kr.amaranth.kotlingrammar.basic


fun main(args: Array<String>) {

}

interface Person_ {
    fun eat() {

    }

    fun sleep() {

    }

    abstract fun study()
}

class Student_() : Person_ {
    override fun eat() {
        println("급식을 먹는다")
    }

    override fun sleep() {
        println("기숙사에서 잠을 잔다")
    }

    override fun study() {
        TODO("Not yet implemented")
    }

}

class Teacher_() : Person_ {
    override fun eat() {
        println("도시락을 먹는다")
    }

    override fun sleep() {
        println("집에서 잠을 잔다")
    }

    override fun study() {
        TODO("Not yet implemented")
    }

}