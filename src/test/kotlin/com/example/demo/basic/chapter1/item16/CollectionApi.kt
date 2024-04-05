package com.example.demo.basic.chapter1.item16

import com.example.demo.basic.BasicPractice

// 이미 정의된 컬렉션 함수형 API만 잘 활용해도 거의 대부분의 기능들을 for, while 루프 없이 구현이 가능하다!!

// filter, map
// 가장 기초가 되는 함수
// 1. filter: 데이터를 필터링
// 2. map: 데이터를 다른 데이터로 변환(매핑)

// all, any, count, find 등도 있다.

val persons = listOf(
    BasicPractice.Person("Captain", 44),
    BasicPractice.Person("Cyclops", 35),
    BasicPractice.Person("Deadpool", 31),
    BasicPractice.Person("Iceman", 54),
)


fun main() {
    println(persons.filter { it.age > 36 })
    println(persons
        .filter { it.age > 36 }
        .map { "${it.name}'s age is ${it.age}" }
    )
    println(persons.all { it.age > 10 })
    println(persons.any { it.age > 10 })
    println(persons.count { it.age > 10 })
    println(persons.find { it.age > 10 }?.name)


}
