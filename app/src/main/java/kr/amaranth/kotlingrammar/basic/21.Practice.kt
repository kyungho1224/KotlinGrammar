package kr.amaranth.kotlingrammar.basic

fun main(args: Array<String>) {

    val tv = TV(listOf<String>("K", "M", "S"))
    tv.channelUp()
    println(tv.checkCurrentChannel())

}

class TV(val channels: List<String>) {

    var onOrOff: Boolean = false

    /* 값의 변화에 따른 제어 set, get */
    var currentChannelNumber = 0
        set(value) {
            field = value
            if (field > channels.size - 1) {
                field = 0
            }
            if (field < 0) {
                field = channels.size
            }
        }
        get() {
            println("호출")
            return field
        }
    /* 값의 변화에 따른 제어 set, get */

    fun switch() {
        onOrOff = !onOrOff
    }

    fun checkCurrentChannel(): String {
        return channels[currentChannelNumber]
    }

    fun channelUp() {
        currentChannelNumber += 1
    }

    fun channelDown() {
        currentChannelNumber -= 1
    }

}