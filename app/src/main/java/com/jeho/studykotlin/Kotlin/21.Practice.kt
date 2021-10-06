package com.jeho.studykotlin.Kotlin

// 3) TV 클래스
// - on/off 기능
// - 채널을 돌리는 기능
// - 초기 채널은 (S사 M사 K사 3개)

fun main(array: Array<String>) {

    val tv = TV(listOf<String>("K", "M", "S"))
    tv.switch()
    println(tv.onOrOff)
    tv.switch()
    println(tv.onOrOff)

    println()

    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
}

class TV(val chennels: List<String>) {

    var onOrOff: Boolean = false // True -> On, False -> Off
    var currentChannelNumber = 0
        set(value) {
            field = value
            if (field > 2) {
                field = 0
            }
            if (field < 0) {
                field = 2
            }
        }

        get() {
            println("호출되었습니다")
            return field
        }

    fun switch() {

        onOrOff = !onOrOff
    }

    fun checkCurrentChannel(): String {

        return chennels[currentChannelNumber]
    }

    fun channelUp() {

        currentChannelNumber += 1
    }


    fun channelDown() {

        currentChannelNumber -= 1
    }

}

