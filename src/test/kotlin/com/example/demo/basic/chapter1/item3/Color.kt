package com.example.demo.basic.chapter1.item3

import com.example.demo.basic.chapter1.item3.Color.*

// 자바의 Enum
//    public enum Color {
//        RED, ORANGE, YELLOW, GREEN
//    }

// 코틀린의 Enum
//    enum class Color {
//        RED, ORANGE, YELLOW, GREEN
//    }


// 프로퍼티와 메서드를 갖는 enum class
enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 166, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);
//    메서드가 있다면 세미콜론으로 구분해줘야 한다.

    fun rgb() = (r * 256 + g) * 256 + b
}

// 하나의 값에 1:1 조건
fun getKoreanColor(color: Color): String =
        when (color) {
            RED -> "빨강"
            ORANGE -> "오렌지"
            YELLOW -> "노랑"
            GREEN -> "녹색"
        }

// 다중 조건
fun getKoreanColors(color: Color): String =
        when (color) {
            RED, ORANGE -> "빨강 또는 오렌지"
            YELLOW -> "노랑"
            GREEN -> "녹색"
        }

// when 문은 Enum 클래스에 새로운 상수가 추가되었는데 기존 코드에서 처리가 안되어 있다면
// 컴파일 에러를 낸다. -> 실수할 확률이 낮아진다. Java에서 Enum과 Switch를 같이 쓸 때의 고질적 문제점 해결

fun main(args: Array<String>) {
    println(getKoreanColor(RED))
    println(getKoreanColors(ORANGE))
}
