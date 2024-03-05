// 패키지와 import 문장은 자바와 거의 유사하다.
package com.example.demo.basic.chapter1.item2

import java.util.*


class Rectangle(val height: Int, val width: Int) {
    // 커스텀 접근자 (Custom getter/setter)
    // Computed Property
    val isSquare: Boolean
        get() {
            return height == width
        }

//    아래와 같이 함수로 선언해도 되지만 동작이 아니라 속성이기 때문에
//    위에 처럼 프로퍼티로 사용하는 것이 좋다.
//    fun isSquare(): Boolean = height == width

}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun main(args: Array<String>) {
    val square = Rectangle(4, 4)
    val rectangle = Rectangle(10, 5)

    println(square.isSquare)
    println(rectangle.isSquare)
}
