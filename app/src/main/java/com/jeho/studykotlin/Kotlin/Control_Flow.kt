package com.jeho.studykotlin.Kotlin

class Control_Flow {
}


// 08. 제어 흐름

// if, else

fun main(array: Array<String>) {

    val a: Int = 5
    val b: Int = 10

    // if, else 사용하는 방법(1)
    if (a > b) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 작다")
    }


    // if, else 사용하는 방법(2)
    if (a > b) {
        println("a가 b보다 크다")
    }


    // if, else 사용하는 방법(3)
    if (a > b) {
        println("a가 b보다 크다")
    } else if (a < b) {
        println("a가 b보다 작다")
    } else {
        println("a와 b가 같다")
    }


    // 값을 리턴하는 if 사용방법 (1)
    val max = if (a > b) {
        a
    } else {
        b
    }


    // 값을 리턴하는 if 사용방법 (2)
    val max2 = if (a > b) a else b

    println()
    println(max)
    println(max2)
    println()


    // practice

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



