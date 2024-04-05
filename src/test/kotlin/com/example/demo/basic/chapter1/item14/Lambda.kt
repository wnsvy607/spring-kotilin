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

// 가장 정석적인 람다 호출, 람다 수식(중괄호)를 함수 호출에 인자로 넣어줌
    println(persons.maxByOrNull { person: Person -> person.age })
// 가장 마지막 인다가 람다 식이면 함수 호출 밖으로 뺄 수 있음
    println(persons.maxByOrNull() { person: Person -> person.age })
// 람다만 있는 경우 빈 괄호 삭제 가능
    println(persons.maxByOrNull { person: Person -> person.age })
// 컴파일러가 타입 추론
    println(persons.maxByOrNull { person -> person.age })
// 람다의 파라미터 이름을 기본 이름인 it으로 수정하면 가장 간결한 람다식이 완성
    println(persons.maxByOrNull { it.age })
// 단일 파라미터만 사용하는 람다식에서 주로 최종 단계 수준으로 활용
// 다중 파라미터이거나 컴파일러 타입 추론이 어려운 경우이거나 깊이가 있는 수식인 경우에는 it이나 타입추론을
// 사용하기 어려울 수 있음
// 상황에 따라 적절히 활용 필요

// 메서드 레퍼런스
    println(persons.maxByOrNull { person -> person.age })
// 이미 정의된 동일한 함수가 있으므로 해당 함수를 넘긴다
    println(persons.maxByOrNull(Person::age))

// 이중 콜론(::)을 활용해서 특정 클래스의 프로퍼티나 메서드를 참조할 수 있음
// 최상위 함수나 값의 경우 topLevelFunction 처럼 클래스명 지정 없이 바로 참조함
}


fun sum(x: Int, y: Int): Int = x + y

val sumLambda = { x: Int, y: Int -> x + y }

