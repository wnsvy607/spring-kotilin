package com.example.demo.basic.chapter1.item5


fun main() {
    val students = mutableMapOf<Int, String>()

    // 아래 처럼 Java 같이도 사용 가능
    // students.put(1, "Jack")
    students[1] = "Jack"
    students[2] = "Diana"
    students[3] = "Frost"

    for (c in students) {
        println("번호:${c.key}, 이름:${c.value}")
    }

    println()

    for ((num, name) in students) {
        println("번호:$num, 이름:$name")
    }

    val st = mapOf(
        1 to "Jack",
        2 to "Diana",
        3 to "Frost"
    )


}
