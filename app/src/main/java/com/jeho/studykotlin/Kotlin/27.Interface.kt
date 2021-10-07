package com.jeho.studykotlin.Kotlin


// 27. Interface
// - 생성자가 없다 -> 인스턴스화 시킬 수 없다 -> 설명서가 아니다
// - 지침서 -> 이것을 구현하고 싶다면 반드시 기능을 구현해라
// 상속의 특징 또한 가지고 있다
// - 자식클래스는 부모클래스의 타입이다
// - 부모클래스는 자식클래스의 타입이 아니다

fun main(args: Array<String>) {
    val student_: Student_ = Student_()
    student_.eat()
    student_.sleep()
}


interface Person_ {
    fun eat()
    fun sleep()
}

class Student_ : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}

class SoccerPlayer_ : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}


// 상속 관계에 있어서
// 부모클래스와 자식클래스 간의 기능 차이가 똑같거나 비슷할 경우에는
// 자식클래스에 override 를 사용하여 상속하는 것이 유리하나
// 기능 차이가 많이 날 경우에는
// interface 를 사용하는 것이 유리하다
open class Person() {
    open fun eat() {

    }

    fun sleep() {

    }
}

class Student() : Person() {
    override fun eat() {
        super.eat()
    }
}

class Teacher() : Person() {

}