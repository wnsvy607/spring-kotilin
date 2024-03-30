package com.example.demo.basic.chapter1.item8

// 구조 분해 선언(Destructuring declarations)
fun main() {
    val person = "Snow" to true
    val (name, isMarried) = person

    val persons = mapOf(
        "Snow" to true,
        "Peter" to false,
        "Paul" to true
    )

    persons.forEach {
        (name, isMarried) ->
        println("$name is married($isMarried)")
    }


    persons.forEach {
            (name, _) ->
        println("$name is in the list")
    }

}
