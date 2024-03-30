package com.example.demo.basic.chapter1.item8

// 자바 또는 코틀린 등으로 만들어진 라이브러리의 클래스에 메서드를 추가하고 싶다면?
// 자바에서는 상속 후 확장할 수 밖에 없었음
// 코틀린은 확장함수를 이용하면 손쉽게 추가

// 다만 확장함수는 오버라이드 할 수 없다
// 내부적으로 정적 메서드를 만들어서 제공하는 것이기 때문
fun String.double() = this + this

val String.lastChar: Char
    get() = get(this.length - 1)

fun main() {
    println("do".double())
    println("do".lastChar)
    // 컬렉션의 추가 메서드들은 모두 확장함수
    println(setOf(1, 23, 45, 3).maxOrNull())
    println(listOf("ab", "bc", "cd").last())

    // 중위 호출 - 너무 많이 쓰면 독이 될 수 있다.
    println("This is very".add("good"))
    println("This is very" add "good")
    println(mapOf("key" to "value", "k2" to "v2"))
    println(mapOf("key".to("value"), "k2".to("v2")))
    println(mapOf(Pair("key", "value"), Pair("k2", "v2")))
//    public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)

}

// 가변 인자 함수
fun <T> multiple(vararg element: T): Set<T> {
    return element.toSet()
}

// 중위 호출 (Infix function)
infix fun String.add(postfix: String) = this + postfix
// 주로 확장함수이면서 파라미터가 한개인 함수에 활용 가능하다.
// 가독성 향상과 코드 길이 축소라는 장점
// 주로 mapOf("key" to "value", "k2" to "v2")에서 많이 사용한다.

