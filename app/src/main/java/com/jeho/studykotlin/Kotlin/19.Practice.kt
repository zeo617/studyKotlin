package com.jeho.studykotlin.Kotlin

fun main(array: Array<String>) {

    val calculator1: Calculator1 = Calculator1()
    println(calculator1.plus(6, 3))
    println(calculator1.minus(6, 3))
    println(calculator1.multiply(6, 3))
    println(calculator1.divide(6, 3))

    println()

    val calculator2: Calculator2 = Calculator2()
    println(calculator2.plus(1, 2, 3, 4, 5))
    println(calculator2.minus(10, 1, 2, 3))
    println(calculator2.multuply(1, 2, 3))
    println(calculator2.divide(10, 2, 3))

    println()

    val calculator3: Calculator3 = Calculator3(3)
    println(calculator3.plus(3).minus(3).multiply(3).divide(2).initialValue)


}


// 1-1) 사칙 연산을 수행할 수 있는 클래스
class Calculator1() {

    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        // 먼저 들어온 수에서 뒤에 들어온 수를 뺀다
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        // 먼저 들어온 수에서 뒤에 들어온 수를 나눈다
        // 몫만 출력한다
        return a / b
    }
}


// 1-2) 사칙 연산을 수행할 수 있는 클래스
class Calculator2() {

    fun plus(vararg num: Int): Int {
        var result: Int = 0
        num.forEach {
            result += it
        }
        return result
    }

    fun minus(vararg num: Int): Int {
        var result: Int = num[0]
        for (i in 0 until num.size) {
            if (i != 0) {
                result -= num[i]
            }
        }
        return result
    }

    fun multuply(vararg num: Int): Int {
        var result = 1
        num.forEach {
            if (it != 0) {
                result *= it
            }
        }
        return result
    }

    fun divide(vararg num: Int): Int {
        var result = num[0]
        num.forEachIndexed { index, i ->
            if (index != 0 && i != 0) {
                result /= i
            }
        }
        return result
    }

}


// 1-3) 사칙 연산을 수행할 수 있는 클래스
class Calculator3(val initialValue: Int) {

    fun plus(number: Int): Calculator3 {
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number: Int): Calculator3 {
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun multiply(number: Int): Calculator3 {
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun divide(number: Int): Calculator3 {
        val result = this.initialValue / number
        return Calculator3(result)
    }

}