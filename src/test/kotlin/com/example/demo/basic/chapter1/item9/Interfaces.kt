package com.example.demo.basic.chapter1.item9

interface Clickable {
    fun click(): Unit
}

// 자바의 implements 와 extends 는 ":"으로 대체됨 (공통)
// 인터페이스의 메서드 구현은 override 변경자를 반드시 붙여야 한다.
class Button : Clickable {
    override fun click() {
        println("Button is clicked")
    }

    private fun internalPrint() {
        println("Internal out")
    }
}

private fun internalPrint() {
    println("Internal out")
}

fun main() {
    Button().click()
    // 자바처럼 해당 클래스 내에서만 접근 가능
    // Button().internalPrint()
    // 파일에 정의된 경우 파일 내에서만 접근 가능
    internalPrint()
}

// 인터페이스 구현시
// 기본 메서드 구현이 가능하다.
interface A {
    fun showOff() = println("123123")
}

interface B {
    fun focus()
    fun showOff() = println("321321")
}

// 다중 인터페이스 구현시 이름이 같은 메서드가 기본 구현이 있다면 컴파일 에러 발생하므로
// 기본 구현을 사용할 수 없다.
//class Child : A, B {
//    override fun focus() {
//        TODO("Not yet implemented")
//    }
//}

// open, final abstract 변경자: 기본적으로 final
// 무분별한 상속과 오버리이드는 취약한 기반 클래스(fragile base class) 문제를 일으킬 수 있음
// 자바: 기본적으로 모든 클래스, 메서드는 상속할 수 있고 final class 는 상속을 할 수 없음
// 코틀린: 기본적으로 모든 클래스, 메서드는 final class(아무 표시가 없어도 final), open class 인 경우에만 상속 가능

// 오픈 클래스 - 상속 가능
open class RichButton : Clickable {
    // final method - 오버라이드 불가
    fun disable() {}

    // open method : 오버라이드 가능
    open fun animate() {}

    // 오버라이드 메서드 : 오버라이드 가능
    override fun click() {}

}

// 문제는 Spring, Spring Data JPA 등 에서 사용할 경우 프록시로 상속 받아서 동작하는 경우가 많다는 것이다.
// 이 문제에 대처하기 위해서 Spring 에서 제공하는 별도의 플러그인을 사용하면
// 필요한 클래스들만 open 상태로 변경해준다.

// public, private, internal, protected: 가시성 변경자
// 자바는 기본적으로, package-private(코틀린에서는 사라짐)
// 코틀린은 기본적으로 public
// 자바와는 다른 부분
// internal: 신규 가시성이며, 모듈(gradle 모듈이나 IntelliJ에서 프로젝트 세팅에서 보이는 모듈 단위)안에서만 볼 수 있는 가시성
// private: 클래스 내에서 사용하면 자바처럼 해당 클래스에서만 사용 가능, 파일 내에서 사용하면 해당 파일 안에서만 볼 수 있음
