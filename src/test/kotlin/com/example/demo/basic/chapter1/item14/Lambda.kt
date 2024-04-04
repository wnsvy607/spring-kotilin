package com.example.demo.basic.chapter1.item14

import com.example.demo.basic.BasicPractice.Person


val persons = listOf(
    Person("Captain", 44),
    Person("Cyclops", 35),
    Person("Deadpool", 31),
    Person("Iceman", 54),
)


// 다음과 같은 람다식 활용 가능
fun main() {
    println(persons.maxByOrNull { it.age })

    // 일반 함수 호출
    println(sum(12, 34))

    // 람다 변수 호출
    println(sumLambda(12, 34))

    //람다 수식 바로 실행
    println({ x: Int, y: Int -> x + y }(12, 34))
}

fun sum(x: Int, y: Int): Int = x + y

val sumLambda = { x: Int, y: Int -> x + y }

