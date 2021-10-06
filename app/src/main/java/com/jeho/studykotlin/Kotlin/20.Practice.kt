package com.jeho.studykotlin.Kotlin

// 2) 은행 계좌 만들기
// - 계좌 생성 기능 (이름, 생년월일)
// - 잔고를 확인 하는 기능
// - 출금 기능
// - 예금 기능

fun main(array: Array<String>) {

    val account: Account = Account("홍길동", "1990/03/01", 1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkBalance())

    println()
    val account2 = Account("홍길동", "1990/03/01", -2000)
    println(account2.checkBalance())

    println()
    val account3 = Account2("홍길동", "1990/03/01")
    val account4 = Account2("홍길동", "1990/03/01", 4000)
    println(account3.checkBalance())
    println(account4.checkBalance())
}

// 1-1) 은행 계좌 만들기
class Account {

    val name: String
    val birth: String
    var balance: Int

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        if (balance >= 0) {
            this.balance = balance
        } else {
            this.balance = 0
        }

    }

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int): Int {
        balance += amount
        return balance
    }

}


// 1-2) 은행 계좌 만들기
class Account2(val name: String, val birth: String, var balance: Int = 1000) {

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int): Int {
        balance += amount
        return balance
    }

}


// 1-3) 은행 계좌 만들기
class Account3(initialBalance: Int) {

    val balance: Int = if (initialBalance >= 0) initialBalance else 0

    fun checkBalance(): Int {
        return balance
    }
}
