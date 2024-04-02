package com.example.demo.basic.chapter1.item12

import java.lang.IllegalStateException

// 클래스 상속 시 베이스 클래스의 생성자를 호출하는 방법
// Java 에서는 super()를 호출하지만 Kotlin 은?

open class Parent(
    val familyName: String
)

class Child(
    val subName: String,
    familyName: String
) : Parent(familyName = familyName)

// 확장하는 클래스의 생성자를 호출해줘야 함
// 확장하는 클래스에 프로퍼티 없는 생성자만 있는 경우에도 호출이 필요함

// 부 생성자(Secondary Constructor)
class Child2 : Parent {
    private val subName: String

    constructor(subName: String) : this(subName, "")

    constructor(subName: String, familyName: String) : super(familyName) {
        this.subName = subName
    }
}
// 클래스 구현부에 constructor 키워드를 활용해서 여러개의 부 생성자 생성 가능
// this() : 다른 생성자 호출
// super() :  베이스 클래스 생성자 호출


// Backing field
// 프로퍼티의 getter/setter를 커스터마이징 하는 방법
class Account {
    var balance: Long = 0
        set(value) {
            if(value < 0) throw IllegalStateException("잔액은 0원 이상만 가능합니다.")

            field = value
        }

    var accountName: String = ""
        get() = "계좌이름:$field"
}

fun main() {
    val account = Account()
    account.balance = 100
    account.accountName = "급여계좌"

    println("balance : ${account.balance}, name: ${account.accountName}")
}
// 프로퍼티 아래에 get(), set(value) 두 개를 활용해서 단순 게터/세터가 아닌 커스텀 가능
// get(), set()에서만 사용가능한 키워드
    // field: backing field 에 접근
