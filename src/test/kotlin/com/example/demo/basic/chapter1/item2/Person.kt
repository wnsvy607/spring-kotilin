package com.example.demo.basic.chapter1.item2

import com.example.demo.basic.chapter1.item2.multi.Jav
import com.example.demo.basic.chapter1.item2.multi.Kot

// lombok 을 내장한 것과 같이 Getter, Setter 가 자동으로 만들어진다.
class Person(val name: String, var age: Int, var isMarried: Boolean)
// Getter, Setter를 커스텀하고자 하는 경우에만 별도의 Getter, Setter 선언

fun main(args: Array<String>) {
    // 선언부 프로퍼티 모두를 갖춘 주 생성자는 자동으로 생성됨
    val p = Person("John", 28, true)

    println(p.name)
    p.age = 29
    println(p.age)
    p.isMarried = false
    println(p.isMarried)


    Kot("")
    Jav("")
}
