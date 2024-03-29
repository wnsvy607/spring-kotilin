package com.example.demo.basic.chapter1.item7


fun getMyName(firstName: String, lastName: String): String =
    "$firstName $lastName"



fun main() {
    println(getMyName("Steve", "Jobs"))

    // 파라미터가 무엇인지 알 수 없어서 혼동이 될 수 있다(특히 파라미터가 많을 때)
    println(getMyName("Jobs", "Steve"))

    // 파라미터에 이름을 붙이면 명확하게 호출 가능
    println(getMyName(lastName = "Jobs", firstName = "Steve"))
}
