package com.jeho.studykotlin.Kotlin

class Control_Flow2 {
}

// 10. 제어흐름2

// When

fun main(args: Array<String>) {

    val value: Int = 1

    when (value) {

        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("I don't know value")
        }

    }

    val value2 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)


    // practice

    val value3: Int? = null

    when (value3) {

        null -> println("value3 is null")
        else -> println("value3 is not null")

    }

    val value4: Boolean? = null

    // when 구문은 조건으로 갖는 값의 모든 경우에 대응해주는 것이 좋다
    when (value4) {

        true -> println("")
        false -> println("")
        null -> println("")

    }

    // 값을 리턴하는 when 구문의 경우 반드시 모든 값을 리턴해야 한다
    val value5 = when (value4) {

        true -> 1
        false -> 3
        null -> 4

    }

    // when 의 다양한 조건식(1)
    val value6: Int = 10

    when (value6) {

        is Int -> {
            println("value6 is int")
        }
        else -> {
            println("value6 is not int")
        }

    }

    // when 의 다양한 조건식(2)
    val value7: Int = 87

    when (value7) {

        in 60..70 -> {
            println("value7 is in 60-70")
        }
        in 70..80 -> {
            println("value7 is in 70-80")
        }
        in 80..90 -> {
            println("value7 is in 80-90")
        }
    }


}