package com.jeho.studykotlin.Kotlin

// 18. Class

// OOP -> Object Oriented Programming (객체지향 프로그래밍)

// "객체"란 뭘까?
// - 이름이 있는 모든 것

// 절차지향 프로그래밍
// - 코드를 위에서부터 아래로 실행을 하면 문제가 해결된다

// 객체지향 프로그래밍 문제 해결 방법
// - 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다
// - 선수, 심판, 경기장, 관중 -> 축구 게임

// 객체를 만드는 방법
// - 설명서가 있어야 합니다 (설명서를 작성해야 한다)

fun main(array: Array<String>) {

    // 클래스(설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "big")

    val bigCar = Car("v8 engine", "big")

    // 우리가 만든 클래스(설명서)는 자료형이 된다
    val bigCar1: Car = Car("v8 engine", "big")

    val superCar: SuperCar = SuperCar("good engine", "big", "white")


    // 인스턴스가 가지고 있는 기능을 사용하는 방법
    val runableCar: RunableCar = RunableCar("simple engine", "short body")

    // RunableCar.ride() -> 불가능 (설명서 자체에는 기능이 없고, 만들어진 객체에서 기능을 사용할 수 있다)

    runableCar.ride()
    runableCar.navi("부산")
    runableCar.drive()


    // 인스턴스의 멤버변수(engine, body, door)에 접근하는 방법
    val runableCar2: RunableCar2 = RunableCar2("nice engine", "long body")
    println(runableCar2.body)
    println(runableCar2.engine)


    // 오버로딩
    println()
    val testClass = TestClass()
    testClass.test(1)
    testClass.test(1, 2)

}

// 클래스(설명서) 만드는 방법(1)
class Car(var engine: String, var body: String) {

}


// 클래스(설명서) 만드는 방법(2)
class SuperCar {

    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {

        this.engine = engine
        this.body = body
        this.door = door

    }

}


// 클래스(설명서) 만드는 방법(3) - (1)번 방법의 확장
class Car1 constructor(engine: String, body: String) {

    var door: String = ""

    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}


// 클래스(설명서) 만드는 방법(4) - (2)번 방법의 확장
class Car2 {

    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {

        this.engine = engine
        this.body = body

    }

    constructor(engine: String, body: String, door: String) {

        this.engine = engine
        this.body = body
        this.door = door

    }


}


// 클래스의 기능들을 만드는 방법(1)
class RunableCar(engine: String, body: String) {

    fun ride() {
        println("탑승하셨습니다")
    }

    fun drive() {
        println("출발합니다")
    }

    fun navi(destination: String) {
        println("${destination}으로 목적지가 설정되었습니다")
    }

}


// 클래스의 기능들을 만드는 방법(2) -(1)번과 (2)번은 완전히 동일하다
class RunableCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    // 초기세팅을 할 때 유용하다
    init {
        println("RunableCar2가 생성되었습니다")
    }

    fun ride() {
        println("탑승하셨습니다")
    }

    fun drive() {
        println("출발합니다")
    }

    fun navi(destination: String) {
        println("${destination}으로 목적지가 설정되었습니다")
    }

}


// 오버로딩 : 이름이 동일하지만 파라미터가 다른 함수를 처리하는 방법
class TestClass() {

    fun test(a: Int) {
        println("up")
    }

    fun test(a: Int, b: Int) {
        println("down")
    }

}
