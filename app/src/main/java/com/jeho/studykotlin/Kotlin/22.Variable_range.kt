package com.jeho.studykotlin.Kotlin


// 변수이 접근 범위
// 1. 전역 변수
// 2. 지역 변수


// 전역 변수
// 전역 변수를 설정할 때에는 어디서든 접근이 가능하기 때문에 최소한으로 설정해주어야 한다
var number100: Int = 10


fun main(args: Array<String>) {

    println(number100)

    val test = Test("홍길동")
    test.name
    println(test.name)

    test.testFun()
    println(test.name)

    test.testFun()
    println(number100)
}

// 여기서 name은 class 내부에서는 어디서든 접근이 가능한 지역 변수이다
class Test(var name: String) {

    fun testFun() {

        // 여기서 birth는 testFun 함수 내부에서만 접근이 가능한 지역 변수이다
        var birth: String = "1995/03/03"

        name = "연제호"
        number100 = 100
    }

    fun testFun2() {
        // name 가능
        // number100 가능
        // birth 불가능
    }
}