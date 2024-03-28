package com.example.demo.basic.chapter1.item5


fun loopWhile() {
    while (true) {
        break
    }
}

fun loopDoWhile() {
    do {
        break
    } while (true)
}


fun evenOrOdd(n: Int) = when {
    n % 2 == 0 -> "even"
    else -> "odd"
}

fun main() {
    // 1 ~ 100까지(100 포함)
    for (i in 1..100)
        println(evenOrOdd(i))

    // 100 ~ 1까지 (3 간격으로 -> 100, 97, 94 ...)
    for (i in 100 downTo 1 step 3)
        println(evenOrOdd(i))
}
