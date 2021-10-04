package com.jeho.studykotlin.Kotlin

// 02. Type = 자료형

// 정수형 = Long > Int > Short > Byte (표현할 수 있는 정수의 범위 순으로 나타냄)
// 실수형 = Double > Float
// 문자 = Char
// 문자열 = String
// 논리형(True/False) = Boolean

// 변수 선언하는 방법(1)
// var/val 변수명 = 값
var number = 10

// 변수 선언하는 방법(2)
// var/val 변수명 : 자료형 = 값
var number1 : Int = 20
var hello1 : String = "Hello"
var point1 : Double = 3.4

// Variable or Value 선택
// 1) 변하지 않는 값이라면 Value
// 2) 앞으로 어떤식으로 사용될지 모르겠다면 Value
// - 코드가 많아질수록 var 변수를 사용하게되면 값이 언제, 어떤식으로 바뀌었는지 찾아봐야 하기 때문에
//   잘 모르겠다면 val 변수를 우선적으로 사용하자


fun main (array: Array<String>) {

    number = 20
//  number = 20.5 (같은 자료형이 아니기 때문에 오류가 남)

}