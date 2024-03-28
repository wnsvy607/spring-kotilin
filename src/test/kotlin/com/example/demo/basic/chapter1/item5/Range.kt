package com.example.demo.basic.chapter1.item5



fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isDigit(c: Char) = c in '0'..'9'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "숫자"
    in 'a'..'z', in 'A'..'Z' -> "알파벳"
    else -> "숫자도 알파벳도 아님"
}

fun main() {
    println("a는 ${recognize('a')}")
    println("3은 ${recognize('3')}")
    println("[는 ${recognize('[')}")
}
