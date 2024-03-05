package com.example.demo.basic.chapter1.item1

// kotlin - 함수를 클래스 안에 정의할 필요가 없다.
// 타입과 파라미터명 순서가 자바와 반대(최근 모던 랭귀지들의 추세와 동일하다.)
fun main(args: Array<String>) {
//    System.out.println() -> println() 바로 호출 가능하다.
    println("Hello, Kotlin!")
}
// 세미콜론(;)이 필요없다.
// 배열처리를 위한 문법이 없다.

class Item1 {
//    함수
//    코틀린에서 함수는 fun 키워드로 시작한다.
    fun sum(a: Int, b: Int) : Int {
        return a + b
    }

// 코틀린의 여러 함수 형태

//    fun sum(a :Int, b: Int): Int = a + b

//    반환 타입 생략 버전 (실수할 가능성이 있어서 명시하는 것이 낫다고 한다)
//    fun sum(a :Int, b: Int) = a + b

//    반환 타입이 없는 버전(java의 void와 동일)
    fun printSomething(something: String): Unit {
        println("Something : $something")
    }

//  변수
//  'val'과 'var'로 선언 가능
//  함수와 마찬가지로 클래스 외부에 선언 가능
//  타입 추론 활용 가능(함수와 동일)
//  변수명 먼저, 타입 뒤(함수와 동일)

//  Int형 변수 선언 즉시 값 할당
    val i: Int = 123
//  변수 타입 추론(생략)
    val j = 321
//  문자열 타입 선언 즉시 값 할당
    val story: String = "There's something strange"

//  변경 가능한 variable 변수 선언 (자바와 마찬가지로 val 활용하는 것이 좋다.)
    fun doSomething1(): Unit {
        var age: Int = 25
        age = 26
    }

//  문자열 템플릿: 변수를 문자열에 삽입할 수 있다.

    fun doSomething2(): Unit {
        val number = 20
        println("Pleas give me $number dollars")
//      수식은 브라켓 안에 넣어야 한다.
        println("I only have ${if (number < 10) number else 10} dollar")
    }

}
