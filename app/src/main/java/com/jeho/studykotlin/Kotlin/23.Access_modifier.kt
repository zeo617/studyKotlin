package com.jeho.studykotlin.Kotlin


// 23. 접근 제어자

fun main(array: Array<String>) {

    val testAccess: TestAccess = TestAccess("아무개")

    testAccess.test()
    println(testAccess.name)

    println()
    // 여기서 문제점은 name 변수를 마음대로 바꾸어 줄 수 있다는 것이다
    testAccess.name = "아무개2"
    println(testAccess.name)

    println()
    // Reward class 에서도 마찬가지로 rewardAmount를 마음대로 바꾸어 줄 수 있다
    val reward: Reward = Reward()
    reward.rewardAmount = 2000

    val testprivate: TestPrivate = TestPrivate(10000)
    // private 키워드로 인해 외부에서 사용불가
    // testprivate.money = 20000
    // testprivate.changeMoney(10000)
    testprivate.keepMoney()


}

class TestAccess {

    var name: String = "홍길동"

    constructor(name: String) {
        this.name = name
    }

    fun test() {
        println("기능테스트")
    }
}

class Reward() {

    var rewardAmount: Int = 1000
}


class TestPrivate {

    // private 으로 지정해주면 외부에서 변경할 수 없다(내부는 가능)
    private var money: Int = 10000

    constructor(money: Int) {
        this.money = money
    }

    fun keepMoney() {
        // private 처리된 함수는 이런식으로 다른 함수의 내부에서 사용이 가능하다
        changeMoney()
    }

    private fun changeMoney() {

    }
}