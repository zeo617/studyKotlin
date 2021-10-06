package com.jeho.studykotlin.Kotlin


// 두번까지는 봐준다
// 두번 이상이 넘어가면 리팩토링 해라

// 25. 상속
// 부모로부터 설명서를 물려받는다

fun main(args: Array<String>) {

    // SuperCar100은 부모로부터 상속받았기에 기능 사용이 가능하다
    val superCar100: SuperCar100 = SuperCar100()
    println(superCar100.drive())
    superCar100.stop()

    // Bus100은 부모로부터 상속받지 못하였기에 기능 사용이 불가능하다
    //    val bus100: Bus100 = Bus100()
    //    bus100.drive()
    //    bus100.stop()

}


// class를 생성하게 되면 그 앞에는 private 키워드가 기본으로 깔려있다
// 따라서 외부에서 사용할 수 없다
// 상속을 하기 위해서는 private 키워드를 지워주기 위해 open 키워드를 넣어준다

// 부모 : Car100
// 자식 : SuperCar100, Bus100
open class Car100() {
    open fun drive(): String {
        return "달린다"
    }

    fun stop() {

    }
}

class SuperCar100() : Car100() {
    override fun drive(): String {
        val run = super.drive()
        return "빨리 $run"
    }
}

class Bus100() {

}