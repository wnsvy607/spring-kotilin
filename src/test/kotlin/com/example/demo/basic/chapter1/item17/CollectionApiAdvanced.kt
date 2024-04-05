package com.example.demo.basic.chapter1.item17

import com.example.demo.basic.BasicPractice.Person


val persons = listOf(
    Person("Captain", 44),
    Person("Cyclops", 35),
    Person("Deadpool", 31),
    Person("Iron Man", 31),
    Person("Iceman", 54),
    Person("Loki", 54),
    Person("Hulk", 54),
)

fun main() {
    // groupBy
    // 특정값으로 key를 만들고 해당 값에 해당하는 원소를 리스트로 갖는 map 객체를 만듬
    println(persons.groupBy { it.age })

    // flatMap, flatten
    // flatten: 중첩 컬렉션(List<List<T>>와 같은)를 단일 컬렉션(List<T>)로 만들어줌
    // flatMap
        // map + flatten
        // map 이후에 중첩 컬렉션이 발생되는 경우 flatMap을 활용하면 단일 컬렉션으로 결과를 바로 만들어줘서 편하다.
        // 하지만 이런 용도로 실제 활용할 일은 잘 없으며, 함수형 프로그래밍에서 매우 적극적으로 활용하게 됨
    val strings = listOf("abc", "def")
    println(strings.map { it.toList() })
    println(strings.map { it.toList() }.flatten())
    println(strings.flatMap { it.toList() })


    // sequence
    // 자바의 스트림과 같은 역할을 함
    // 대량 컬렉션에 필터링이나 찾기 연산을 하는 경우 유용함
        // sequence가 아닌 경우 무조건 모든 결과를 계산
        // sequence는 조건에 맞는 경우, 결과가 필요한 경우에 한해서 계산을 진행

    println(
        persons.map {
            println(it)
            it.name
        }.find { it.startsWith("I") }
    )

    // 대량 데이터에서 하나만 찾으면 되는 연산에서 sequence 사용을 고려해 볼만 하다.
    // 그렇지만 서버 메모리에 대량 데이터를 올린다는 발상 자체가 안티패턴이다.
    println(
        persons.asSequence()
            .map {
                println(it)
                it.name
            }.find { it.startsWith("I") }
    )


}
