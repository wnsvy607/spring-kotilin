package com.example.demo.basic.chapter1.item7

fun getMyNameWithDefault(firstName: String = "foo", lastName: String = "bar"): String =
    "$firstName $lastName"
// Java 에서는 파라미터가 일부만 달라도 오버로딩으로 여러 메서드를 만드는 케이스가 흔하고, 불편을 초래함
// 코틀린은 디폴트 파리미터를 활용해 하나의 메서드로 마치 여러 메서드 같은 효과를 낼 수 있음

fun main() {
    // 파라미터 없이 호출하면 기본 값으로 호출
    println(getMyNameWithDefault())

    // 파라미터를 적게 넣어서 호출하면 앞쪽부터 파라미터를 채우고 나머지는 기본 값 사용
    println(getMyNameWithDefault("Steve"))

    // 특정 파라미터를 이름 붙인 인자로 호출하면 해당 값만 수정해서 호출
    println(getMyNameWithDefault(lastName = "Jobs"))
}
