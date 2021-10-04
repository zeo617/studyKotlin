package com.jeho.studykotlin.Kotlin


// 1번 문제
// List를 두개 만든다
// 첫번째 List에는 0부터 9까지 값을 넣는다 (반복문 사용)
// 두번째 List에는 첫번째 List의 값을 하나씩 확인한 후
// 짝수면 True 홀수면 False를 넣어준다

// 결과는
// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// [false, true, false, true, false, true, false, true, false]


// 2번 문제
// 학점을 구하자
// 80-90 -> A
// 70-79 -> B
// 60-69 -> C
// 나머지 F

fun main(array: Array<String>) {

    // 1번 문제
    val firstList = mutableListOf<Int>()

    for (item in 1..9) {
        firstList.add(item)
    }
    println(firstList)
    println()


//    val secondList = mutableListOf<Boolean>()
//
//    when {
//
//      }


    // 2번 문제
    var score: Int = 59

    if (score in 80..90) {
        println("A")
    } else if (score in 70..79) {
        println("B")
    } else if (score in 60..69) {
        println("C")
    } else {
        println("F")
    }
    println()


    // 3번 문제
//    var third = mapOf<String, Int>("a" to 1, "b" to 2)


    // 4번 문제


}


// 3번 문제
// 전달 받은 숫자의 각 자리 수의 합을 구하자
// 조건 : 전달 받은 숫자는 무조건 두자리 숫자이다
// 예시 : 89일 경우, 8 + 9 = 17


// 4번 문제
// 구구단을 출력하자