package com.jeho.studykotlin.Kotlin


// 14. Collection

// -> list, set, map


fun main(args: Array<String>) {

    // Immutable Collections - 처음 만들 때 한번 정하면 바꿀 수 없다 (val 느낌)

    // List - 중복을 허용한다
    val numberList = listOf<Int>(1, 2, 3, 3, 3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])


    // Set - 중복을 허용하지 않는다 / 순서(인덱스)가 없다
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println()
    numberSet.forEach {
        println(it)
    }


    // Map - Key, Value 방식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println()
    println(numberMap.get("one"))


    // Mutable Collection - 변경 가능

    // List
    val MnumberList = mutableListOf<Int>(1, 2, 3)
    MnumberList.add(3, 4)
    println()
    println(MnumberList)


    // Set
    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mNumberSet.add(10)
    println()
    println(mNumberSet)


    // Map
    val mnumberMap = mutableMapOf<String, Int>("one" to 1)
    mnumberMap.put("two", 2)
    println()
    println(mnumberMap)


}