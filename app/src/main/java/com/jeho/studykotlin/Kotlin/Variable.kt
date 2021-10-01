package com.jeho.studykotlin.Kotlin

class Variable {
}


// 01. Variable = 변수 (상자안에 복잡한 정보를 집어넣어 놓고, 필요할 때 상자 안에서 꺼내어 사용함)

// 변수 선언하는 방법
// var/val 변수명(상자) = 값(정보)
// var = Variable의 약어로 한번 지정한 값을 바꿀 수 있다
// val = Value의 약어로 한번 지정한 값을 바꿀 수 없다

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(args:Array<String>) {

    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Good Bye"
    point = 10.4

    println(num)
    println(hello)
    println(point)
    println(fix)
}