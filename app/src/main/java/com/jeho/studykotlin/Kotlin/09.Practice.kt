package com.jeho.studykotlin.Kotlin

// practice

fun main(array: Array<String>) {

    val c: Int? = null
    val d: Int = 10
    val e: Int = 100

    if (c == null) {
        println("a is null")
    } else {
        println("a is nit null")
    }


    if (d + e == 110) {
        println("d plus e is 110")
    } else {
        println("d plus e is not 110")
    }


// 엘비스 연산자
    val number: Int? = null
    val number2 = number ?: 10

    println()
    println(number2)

    val num1: Int = 10
    val num2: Int = 20

    val max1 = if (num1 > num2) {
        num1
    } else if (num1 == num2) {
        num2
    } else {
        100
    }

}