package com.example.demo.basic.chapter1.item19

import com.example.demo.basic.chapter1.item14.persons
import java.lang.IllegalStateException

// 코틀린의 원시 타입
// 코틀린은 원시타입과 래퍼타입을 구분하지 않음
// 코틀린은 자바 클래스 파일을 만드는 방식으로 동작하는데 상황에 따라 원시타입/래퍼타입을 넣어줌
    // 특별한 이유가 없으면 원시타입
    // nullable 하거나 제네릭에 쓰거나 라이브러리 호출 시에는 래퍼타입


// 숫자의 타입 변환
// 자바는 int, long 간에 범위가 같으면 자동으로 변환을 수행하지만 코틀린은 직접 수행 필요
val i:Int = 1
val l:Long = i.toLong()
// toLong, toInt, toShort 등 다양한 변환함수 제공


// Any, Any?: 최상위 타입
// 자바의 Object 와 비슷한 코틀린의 Any 타입
// Any는 not null 타입이며, Any?는 nullable한 값이며 null을 포함한 모든 값을 대입 받을 수 있다.


// Unit: 코틀린의 void 역할을 수행
fun printSomething():Unit {
    println("Something")
}
// 자바에서 return 값이 없는 경우 void를 쓰듯 코틀린에서는 Unit을 활용
// 하지만 Unit을 생략해도 된다

// Nothing: 이 함수는 정상적으로 끝나는 케이스가 없음(Nothing)
fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main() {
    val name = persons.find { it.age > 50 } ?: fail("50살이 넘는 사람이 없음")
}

// 컬렉션과 배열
// 컬렉션 내에도 nullable 타입을 넣을 수 있으며, 컬렌션 자체도 nullable할 수 있다.
