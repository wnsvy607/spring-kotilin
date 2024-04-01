package com.example.demo.basic.chapter1.item11

//가장 많이 사용되는 버전
class User(val userName: String) {
}

// 생성자 및 초기화에 가장 명시적인 버전
class User2 constructor(_userName: String) {
    val userName: String

    init {
        userName = _userName
    }
}
// 생성자는 constructor 키워드로 명시적으로 생성
// init block 에서는 클래스 객체가 생성될 때 생성자에서 받은 값으로 프로퍼티 초기화 함


// 위 버전을 다소 간소화 한 버전
class User3(_userName: String) {
    val userName: String = _userName
}

// 기본 파라미터 값을 갖는 생성자
data class User4 (
    val userName: String,
    // 생성자의 파라미터 옆에 기본 값을 적어주면 해당 값이 기본값이 되어 생략 가능
    val level: Int = 1
)

fun main() {
    println(User4("Jekyll"))
    println(User4(userName = "Jekyll"))
    println(User4("Hyde", 10))
    println(User4(userName = "Hyde", level = 10))
}
