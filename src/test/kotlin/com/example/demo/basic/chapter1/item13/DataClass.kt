package com.example.demo.basic.chapter1.item13


data class User(val name: String, val age: Int)
// 클래스 키워드에 data만 붙이면 된다.
// 데이터를 젖아하는 주 용도로 활용하는 클래스 타입으로 다양한 기본 기능을 제공한다(lombok의 @Data와 유사하다)
// 기본 제공 기능
// 1. toString()
// 2. equals(), hashCode() -> 동일성 검증 대신 동등성 검증으로 바꿔준다.

// object 키워드: 클래스 선언 + 객체 생성(싱글턴)
object Family {
    val members = mutableListOf<Person>()
}

class Person(val name: String)

// 자바에서의 싱글톤과 같은 목적으로 클래스 선언과 객체 생성을 동시에 진행
// 직접 생성할 필요가 없으며, 별도 인스턴스 생성 불가
// 싱글톤 패턴과 같이 어플리케이션에 인스턴스가 단 한개만 필요한 경우에 활용하면 좋다.
// Comparator의 구현처럼 단 한번만 사용되는 경우에도 사용 가능
// 자바에서 Util Class처럼 내부에 static method만 존재하고 별도 인스턴스 생성 안하는 경우에도 사용 가능
// 하지만 이런 경우에는 클래스 없이 파일에 바로 함수를 만들어서 사용하는(최상위 함수, top level function)이 더 낫다.
// 익명 클래스에도 object 키워드 사용 가능

object NumberUtils {
    fun sum(a: Int, b: Int) = a + b
}

fun main() {
    Family.members.add(Person("snow"))
    println(NumberUtils.sum(10, 20))

    println(Child.ofDefaultAge("Snow", "John").age)
}


//companion object: 자바의 static method를 대체하는 용도

open class Parent(val familyName: String)
class Child(private val subName: String, familyName: String, val age: Int) : Parent(familyName) {

    companion object {
        const val MAX_CHILDREN_COUNT = 4
        fun ofDefaultAge(
            subName: String, familyName: String
        ): Child = Child(subName, familyName, 0)
    }
    // 자바에서 static으로 상수 값을 저장하거나 factory 생성자를 만들던 방식을 동일하게 활용 가능
}


