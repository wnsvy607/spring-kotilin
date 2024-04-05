package com.example.demo.basic

import org.junit.jupiter.api.Test

class BasicPractice {

    //    1. 함수
    @Test
    fun basicFunction() {
        println("기본 함수 정의")
        println(";(세미 콜론)을 붙이지 않아도 된다.")
        var number = max(10, 100)
        println(number)
    }

    //  식이 본문인 함수
    fun max(a: Int, b: Int): Int = if (a > b) a else b

//    식이 본문인 함수는 리턴타입 생략이 가능하다
//    fun max(a: Int, b: Int) = if (a > b) a else b

//    블록이 본문인 함수
//    fun max(a: Int, b: Int): Int {
//        return if (a > b) a else b
//    }


//    2. 변수

    fun basicVar() {
        val variable1 = 42 // 타입 생략
        val variable2: Int = 42 // 타입 지정

//        초기화 식을 사용하지 않고 변수를 선언하려면 변수 타입을 반드시 명시해야한다.
        val variable3: Int
        variable3 = 42
    }


    //    val 변수
    fun immutable() {
        //자바의 final 변수와 마찬가지로 참조 변경이 불가능하다.
        val sth = "something"
        //아래와 같이 참조를 변경하면 컴파일 에러 발생!
        //sth = "123123"
    }

    //    var 변수
    fun mutable() {
        var sth = "something"
        //var 로 선언한 변수는 참조 변경이 가능하다.
        sth = "123123"
    }

    //    문자열 템플릿

    @Test
    fun stringTemplate() {
        val name = "이준표"
        println("Hello, $name")
    }

    //    클래스와 프로퍼티
    data class Person(
            val name: String, // 읽기 전용 프로퍼티로 코틀인은 비공개 필드와 게터를 만들어낸다.
            var age: Int  // 비공개 필드, 게터, 세터를 만들어 낸다.
    )


    fun exampleClass() {
        var john = Person("John", 35)
        john.age = 10
    //  val 변수는 세터가 없으므로 아래와 같은 코드는 컴파일에러 발생
    //  john.name = "123"
    }

}
